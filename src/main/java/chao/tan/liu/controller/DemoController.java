package chao.tan.liu.controller;
 
import chao.tan.liu.entity.UserInfo;
import chao.tan.liu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/index")
public class DemoController extends BaseController{

    @Autowired
    private IUserService userService;

    @RequestMapping
    public String index( Model model){
        UserInfo userInfoByUserId = userService.getUserInfoByUserId(1);
        model.addAttribute("name",userInfoByUserId);
        return "index";
    }
}