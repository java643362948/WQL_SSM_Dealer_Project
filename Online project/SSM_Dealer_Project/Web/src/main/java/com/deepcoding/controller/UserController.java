package com.deepcoding.controller;

import com.deepcoding.domain.Role;
import com.deepcoding.domain.UserInfo;
import com.deepcoding.service.UserService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    //给用户添加角色
    @RequestMapping("/addRoleToUser.do")
    public String addRoleToUser(@RequestParam(name = "userId", required = true)Integer userId, @RequestParam(name = "ids", required = true) Integer[] roleIds) {
        userService.addRoleToUser(userId, roleIds);
        return "redirect:findAll.do";
    }
    //查询指定id的用户
    @RequestMapping("/findById.do")
    public ModelAndView findById(Integer id) throws Exception{
        ModelAndView mv = new ModelAndView();
        UserInfo userInfo = userService.findById(id);
        mv.addObject("user",userInfo);
        mv.setViewName("user-show1");
        return mv;
    }
    //用户添加
    @RequestMapping("/save.do")
    @PreAuthorize("authentication.principal.username=='admin'")
    public String save(UserInfo userInfo) throws Exception {
        userService.save(userInfo);
        return "redirect:findAll.do";
    }
    @RequestMapping("/findAll.do")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<UserInfo> userList = userService.findAll();
        mv.addObject("userList",userList);
        mv.setViewName("user-list");
        return mv;
    }
    //查询用户以及用户可以添加的角色
    @RequestMapping("/findUserByIdAndAllRole.do")
    public  ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id",required = true)Integer userid)throws Exception{
        ModelAndView mv = new ModelAndView();
        //根据用户查询用户
        UserInfo userInfo = userService.findById(userid);
        //根据用户id查询可以添加的角色
       List<Role> otherRoles= userService.findOtherRoles(userid);
       mv.addObject("user",userInfo);
       mv.addObject("roleList",otherRoles);
       mv.setViewName("user-role-add");
        return  mv;
    }
}
