package com.syedhakeem.Sunbase.Data.LoginController;

import com.syedhakeem.Sunbase.Data.LoginDomain.Login;
import com.syedhakeem.Sunbase.Data.LoginService.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @GetMapping("/")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("login", new Login());
        return mav;
    }
    @PostMapping("/")
    public String login(@ModelAttribute("login") Login login){
        Login oauthlogin = loginService.login(login.getUsername(), login.getPassword());
        return Objects.nonNull(oauthlogin) ? "redirect:/showClients" : "redirect:/";
    }
}
