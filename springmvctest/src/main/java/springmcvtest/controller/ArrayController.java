package springmcvtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class ArrayController {

    @RequestMapping("array")
    @ResponseBody
    public void testArray(String[] favs) {
        System.out.println(Arrays.toString(favs));
    }
}
