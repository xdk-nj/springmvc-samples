package springmcvfileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionListener;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
public class DownloadController {

    @RequestMapping("/download")
    @ResponseBody
    public void download(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String realPath = req.getServletContext().getRealPath("/img2020-12-19/");
        String fileName = "9eea296e-8b85-443b-8da9-8fdb05e92493.jpg";
        String filePath = realPath + fileName;

        FileInputStream fis = new FileInputStream(filePath);
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-Disposition","attachment; filename=" + fileName);
        ServletOutputStream outputStream = resp.getOutputStream();

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            outputStream.write(buf, 0, len);
        }
        outputStream.close();
        fis.close();
    }
}
