package springmvcvalidate.controller;

import springmvcvalidate.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvcvalidate.validation.ValidationG1;
import springmvcvalidate.validation.ValidationG2;

import java.util.List;

@Controller
public class StuController {

    @RequestMapping("/addStu")
    @ResponseBody
    public void addStu(@Validated(ValidationG1.class) Student student, BindingResult result) {
        if (result != null) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getObjectName() + "--" + error.getDefaultMessage());
            }
        }
        System.out.println(student);
    }


    @RequestMapping("/updateStu")
    @ResponseBody
    public void updateStu(@Validated(ValidationG2.class) Student student, BindingResult result) {
        if (result != null) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getObjectName() + "--" + error.getDefaultMessage());
            }
        }
        System.out.println(student);
    }
}
