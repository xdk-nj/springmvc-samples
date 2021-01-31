package springmcvtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springmcvtest.bean.MyMap;

@Controller
public class MapController {
    @ResponseBody
    @RequestMapping("map")
    public void map(MyMap myMap) {
        System.out.println(myMap);
    }
}
