package com.cjw.interceptor;

import com.cjw.po.Permission;
import com.cjw.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    //进入Controller之间进行验证
    //这个方法有返回值，如果为true，可以进入Controller
    //因此，一般我们需要验证的一些内容都放入到preHandle方法中
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("======LoginInterceptor.preHandle======");
        String uri = request.getRequestURI();
        System.out.println("uri = " + uri);
        boolean isRight = false;
        if(uri.indexOf("login") != -1){
            return true;
        }
        else{
            HttpSession session = request.getSession();
            Object obj = session.getAttribute("user");
            if(obj != null){
                User user = (User)obj;
                List<Permission> permissions = user.getPermissions();
                for (Permission p:permissions) {
                    if(p.getModuleUrl().equalsIgnoreCase(uri)){
                        isRight = true;
                        break;
                    }
                }

                if(isRight){
                    return true;
                }
                else{
                    session.removeAttribute("user");
                    response.sendRedirect("/sushe_sys/login.jsp");
                }

            }
            else{
                response.sendRedirect("/sushe_sys/login.jsp");
            }
            return true;
        }
    }

    @Override
    //进入到Controller中可以执行的方法
    //一般在这个方法中我们可以记录日志
    //或者做一些内容的过滤
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("======LoginInterceptor.postHandle======");

    }

    @Override
    //执行完jsp之后，执行afterCompletion
    //一般这里面就记录日志或者处理异常
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("======LoginInterceptor.afterCompletion======");

    }
}
