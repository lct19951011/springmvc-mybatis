package chao.tan.liu.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class MyExceptionHandler implements HandlerExceptionResolver {
  
  public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                       Exception ex) {
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("name", ex.getMessage());
      
    // 根据不同错误转向不同页面 
    if(ex instanceof HandException) {
      return new ModelAndView("error-hand", model);
    }else {
      return new ModelAndView("error", model); 
    } 
  } 
} 