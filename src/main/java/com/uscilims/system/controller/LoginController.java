package com.uscilims.system.controller;

import com.uscilims.system.entity.SysUser;
import com.uscilims.system.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController implements HandlerInterceptor {

    @Autowired
    SysUserService sysUserService;

    @GetMapping("login")
    public ModelAndView loginView() {
        return new ModelAndView("admin/login");
    }

    //登陆
    @PostMapping(value = "login")
    public String login(@RequestParam("username") String userName,
                        @RequestParam("password") String passWord,
                        HttpSession session,HttpServletRequest request){
//        System.out.println("用户名："+userName);
//        System.out.println("密码："+passWord);
        SysUser sysUser = sysUserService.loginValidate(userName, passWord);
        if (sysUser!=null){
            session.setAttribute("loginUser",sysUser);
            return "admin/main";
        }else {
            request.setAttribute("msg","用户名或密码错误");
            return "admin/login";
        }

    }
    //退出
    @RequestMapping("/logout")
    public String  logout(HttpServletRequest request){
        //移除session
        request.getSession().invalidate();
        return "redirect:/admin/login";
    }


}
