package springmvcexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvcexception.exception.TestException;

@Controller
public class ExceptionController {
    @RequestMapping("/exception")
    @ResponseBody
    public void exception() {
        int i = 1 / 0;
    }

    @RequestMapping("/testexception")
    @ResponseBody
    public void testexception() throws TestException {
        int i = 1;
        if (i == 1) throw new TestException("TestException Happens");

    }
}
