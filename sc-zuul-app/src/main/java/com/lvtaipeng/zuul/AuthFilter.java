package com.lvtaipeng.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AuthFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 2;//数字越小过滤优先级别越高
    }

    @Override
    public boolean shouldFilter() {
        //获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        String requestURI = currentContext.getRequest().getRequestURI();
        if(requestURI.startsWith("/brand/")){
            return true;
        }
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("过滤器的run方法被执行了");
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletResponse response = currentContext.getResponse();
        currentContext.setSendZuulResponse(false);
        currentContext.setResponseStatusCode(401);
        response.setContentType("application/json;charset=utf-8");
        try {
            /** 输出返回结果 **/
            response.getWriter().write("{\"message\":\"未授权\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
