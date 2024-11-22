package com.ec.ectrainingapi.controller.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class AdminAuthController {
    /**
     * login画面
     * @return
     */
    @RequestMapping("/admin/login")
    public String login() {
        return "login";
    }

    /**
     * ログイン失敗時の画面
     * @param model
     * @return
     */
    @GetMapping("/admin/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }
}
