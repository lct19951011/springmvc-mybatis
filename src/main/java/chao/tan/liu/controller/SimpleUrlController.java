package chao.tan.liu.controller;

import chao.tan.liu.dao.UserInfoMapper;
import chao.tan.liu.entity.UserInfo;
import chao.tan.liu.exception.HandException;
import chao.tan.liu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p></p>
 *
 * @author chaotan.liu
 * @version 1.0
 * @date 2020/8/9 14:47
 */

public class SimpleUrlController implements Controller {


    @Autowired
    private IUserService userService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        try {
//            int i = 1/0;
//        }catch (Exception e){
//            throw new HandException("aas");
//        }
        String a = httpServletRequest.getParameter("a");
        UserInfo userInfoBySpringMybatis = userService.getUserInfoBySpringMybatis(1);
        ModelAndView mv =new ModelAndView("index");
        mv.addObject("name",userInfoBySpringMybatis.getUserName());
        return mv;
    }
}
