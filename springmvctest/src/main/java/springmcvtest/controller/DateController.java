package springmcvtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class DateController {

    @RequestMapping("/date")
    @ResponseBody
    public void date(Date date) {
        System.out.println(date);
    }
}
