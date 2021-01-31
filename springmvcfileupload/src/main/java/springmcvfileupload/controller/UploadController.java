package springmcvfileupload.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
/***
 * 对于多文件上传  key相同  使用数组MultipartFile[] file来接收
 *              key不同  使用多个变量MultipartFile file1， file2...来接收
 * */
@Controller
public class UploadController {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest req) {
        String format = sdf.format(new Date());
        String realPath = req.getServletContext().getRealPath("/img") + format;
        System.out.println(realPath);
        File folder = new File(realPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String oldName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf('.'));

        try {
            file.transferTo(new File(realPath, newName));
            String url = req.getScheme() + "://"
                        + req.getServerName()
                        + ":" + req.getServerPort()
                        + "/img" + format + "/" + newName;
            return "redirect: " + url;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "failed";
    }
}
