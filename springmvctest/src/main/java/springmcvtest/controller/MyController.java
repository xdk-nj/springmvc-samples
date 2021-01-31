package springmcvtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springmcvtest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MyController{

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public ModelAndView hello() {
        System.out.println(helloService.hello("徐度康"));
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("name", "javaboy");
        return mv;
    }

    @RequestMapping("/hello2")
    public void hello2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pages/hello.jsp").forward(req, resp);
    }

    @RequestMapping("/hello3")
    public void hello3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/pages/hello.jsp");
    }

    @RequestMapping("/hello4")
    public String hello4(Model model) {
        model.addAttribute("name", "javaboy");
        return "hello";
    }

    @RequestMapping("/hello5")
    public String hello5() {
        return "forward:/pages/hello.jsp";
    }

    @RequestMapping("/hello6")
    public String hello6() {
        return "redirect:/hello4";
    }

    @RequestMapping(value = "/hello7", produces = "text/html;charset = utf-8")
    @ResponseBody
    public String hello7() {
        return "Java程序设计";
    }
}
