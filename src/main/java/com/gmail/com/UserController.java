package com.gmail.com;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String onLogin() {
        return "login";
    }

    @GetMapping("/greetings")
    public String getGreetings(HttpServletRequest request) {
        return (request.getSession().getAttribute("user") != null) ? "greetings" : "redirect:/login";
    }

    @PostMapping("/greetings")
    public String postGreetings(Model model,
                            @RequestParam("user_login") String user_login,
                            @RequestParam("user_password") String  user_password,
                            HttpServletRequest request) {
        String result = "";

        for (UserModel user : userService.listUsers) {
            if (user.getLogin().equals(user_login) && user.getPassword().equals(user_password)) {
                request.getSession().setAttribute("user", user.getLogin()); // setSession
                model.addAttribute("user", user.getLogin());
                result = "greetings";
                break;
            } else {
                model.addAttribute("message", "Wrong login or password");
                result = "login";
            }
        }
        return result;
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/login";
    }

    @GetMapping("/database")
    public String database(Model model, HttpServletRequest request) {
        model.addAttribute("listUsers", userService.listUsers);

        return (request.getSession().getAttribute("user") != null) ? "database" : "redirect:/login";
    }
}
