package com.lizxing.shirodemo.controller;

import com.lizxing.shirodemo.entity.User;
import com.lizxing.shirodemo.util.MD5Utils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author lizxing
 * @date 2021/8/9
 */
@RestController
public class UserController {

    @PostMapping("/login")
    @ResponseBody
    public String login(String username, String password) {
        // 密码MD5加密
        password = MD5Utils.encrypt(username, password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 获取Subject对象
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return "成功，" + SecurityUtils.getSubject().getPrincipal();
        } catch (Exception e) {
            return "失败，" + e.getMessage();
        }
    }


    @RequiresPermissions("user:user")
    @GetMapping("user")
    public String userList() {
        return "获取用户列表";
    }

    @RequiresPermissions("user:add")
    @PostMapping("user/add")
    public String userAdd(User user) {
        return "新增用户" + user;
    }

    @RequiresPermissions("user:delete")
    @PostMapping("user/delete")
    public String userDelete(User user) {
        return "删除用户" + user;
    }
}
