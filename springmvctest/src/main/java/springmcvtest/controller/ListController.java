package springmcvtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springmcvtest.bean.Library;

import java.util.List;

@Controller
public class ListController {
    @RequestMapping("/list")
    @ResponseBody
    public void list(Library library) {
        System.out.println(library);
    }
}
