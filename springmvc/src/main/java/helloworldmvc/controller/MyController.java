package helloworldmvc.controller;

import helloworldmvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller("/hello")
public class MyController implements Controller {

    @Autowired
    HelloService helloService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest req,
                                      HttpServletResponse resp)
                                        throws Exception {
        System.out.println(helloService.hello("徐度康"));
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name", "javaboy");
        return mv;
    }
}
