package exceptionHandler;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import util.MailUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;

public class MyExceptionResolver implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
// 如果异常类型不是我们自定义的异常，我们转为自定义异常。
        if(!(e instanceof MyException)){
                e = new MyException("系统异常","1000");
        }
        String email = "1484616762@qq.com";
        // 获取异常栈信息
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        e.printStackTrace(new java.io.PrintWriter(buf, true));
        String expMessage = buf.toString();
        String text = "异常！<br>错误码：" +((MyException) e).getCode()+"<br>错误信息："+ e.getMessage()+ "<br>"+ expMessage;

        MailUtils mailUtils = new MailUtils(email,text,"IOS_4报错!");
        mailUtils.start();
        modelAndView.setViewName("error");
        httpServletRequest.setAttribute("exception",e);
        return modelAndView;
    }
}
