package chao.tan.liu.controller;

import com.sun.xml.internal.ws.handler.HandlerException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * controller继承---通过注解形式 获取异常 跳转页面
 */
public class BaseController {
  /** 基于@ExceptionHandler异常处理 */
  @ExceptionHandler
  public String exp(HttpServletRequest request, Exception ex) {
      
    request.setAttribute("name", ex);
      
    // 根据不同错误转向不同页面 
    if(ex instanceof HandlerException) {
      return "error-hand";
    } else {
      return "error"; 
    } 
  } 
} 