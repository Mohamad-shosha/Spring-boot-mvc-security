package com.luv2code.springboot.demosecurity.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Democontroller {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "fancy-login";
    }

    @GetMapping("/")
    public String showhome() {
        return "home";
    }

    @GetMapping("/leaders")
    public String showleaders() {
        return "leaders";
    }

    @GetMapping("/systems")
    public String showsystems() {
        return "systems";
    }

    @GetMapping("/access-denied")
    public String showaccessdenied() {
        return "access-denied";
    }


}