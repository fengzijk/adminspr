package com.adminspr.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author timothy
 * @created 17/9/13 下午14:53
 */
@Controller
//@RequestMapping("/login")
public class AuthController {

  private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

  @RequestMapping(value = "/login",method = RequestMethod.GET)
  String login(Model model) {
    model.addAttribute("name","caidan");
    return "login";

  }

  @RequestMapping(value = "/logout",method = RequestMethod.GET)
  String logout(HttpServletRequest request, HttpServletResponse response, Model model) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();

    if (auth != null){
      new SecurityContextLogoutHandler().logout(request, response, auth);
    }
//    model.addAttribute("name","caidan");
    return "redirect:/login";

  }

}
