package com.jeon.board.global.users.controller;


import com.jeon.board.global.users.dto.UsersDTO;
import com.jeon.board.global.users.service.UsersServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;
import javax.servlet.http.HttpSession;


@Controller
public class UserController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private UsersServiceImpl usersService;

  @RequestMapping("login.do")
  public String login() {
    return "/login";
  }

  @RequestMapping("loginCheck.do")
  public String loginCheck(HttpSession session, Model model){
    logger.info("USERS");

    List<UsersDTO> users = this.usersService.selectUserList();

    model.addAttribute("id", users.get(0).getId());
    model.addAttribute("pw", users.get(0).getPassword());
    model.addAttribute("name", users.get(0).getName());
    model.addAttribute("role", users.get(0).getRole());

    return "login";
  }

}
