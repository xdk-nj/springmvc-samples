package springmvcexception.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice //增强版Controller 用来做全局数据处理
public class MyException {

    @ExceptionHandler(Exception.class) //表示拦截所有异常
    public ModelAndView exception(Exception e) {
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("error", e.getMessage());
        return mv;
    }

    @ExceptionHandler(TestException.class)
    public ModelAndView testexception(TestException e) {
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("error", e.getMessage());
        return mv;
    }
}
