package springmvcdatashow.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import springmvcdatashow.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvcdatashow.validation.ValidationG1;
import springmvcdatashow.validation.ValidationG2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StuController {

    @ModelAttribute("info")
    public Map<String, Object> info() {
        Map<String, Object> map = new HashMap<>();
        map.put("date", "2020-11-19");
        map.put("name", "徐度康");
        return map;
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("/addStu")
    public String addStu(@Validated(ValidationG2.class) Student student, BindingResult result) {
        if (result.getAllErrors().size() != 0) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getObjectName() + "--" + error.getDefaultMessage());
            }
            return "addstudent";
        }
        return "index";
    }


    @RequestMapping("/updateStu")
    public String updateStu(@ModelAttribute("s") @Validated(ValidationG2.class) Student student, BindingResult result) {
        if (result.getAllErrors().size() != 0) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getObjectName() + "--" + error.getDefaultMessage());
            }
            return "updatestudent";
        }
        return "index";
    }
}
