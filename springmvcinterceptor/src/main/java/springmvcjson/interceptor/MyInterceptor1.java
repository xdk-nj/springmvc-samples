package springmvcjson.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * preHandle - method - postHandle - 页面 - afterCompletion
 * */
@Component
public class MyInterceptor1 implements HandlerInterceptor {

    /**目标方法执行之前调用*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor1 -- preHandle正在执行");
        return true;
    }

    /**目标方法执行之后调用*/
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor1 -- postHandle正在执行");
    }

    /**来到页面之后调用*/
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor1 -- afterCompletion正在执行");
    }
}
