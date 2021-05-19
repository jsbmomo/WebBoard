package com.jeon.board;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

  @RequestMapping(value = "/main")
  public ModelAndView mainPage(){
    ModelAndView mav = new ModelAndView();
    mav.addObject("message", "TEST TEXT");
    mav.setViewName("mainViewPage");
    return mav;
  }

//  @RequestMapping(value = "/home")
//  public String subPage(HttpRequest http){
//
//
//
//
//    return "contentsPage";
//  }

}
