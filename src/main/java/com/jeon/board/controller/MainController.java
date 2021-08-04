package com.jeon.board.controller;


import com.jeon.board.dto.MainDTO;
import com.jeon.board.service.MainServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// Mybatis TEST https://velog.io/@wimes/2.-%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD%EC%84%A4%EC%A0%95-Spring-MyBatis-MySQL%EC%9D%98-%EC%84%A4%EC%A0%95-2zk4cf5gof
// Mybatis SET https://dalpaeng00.tistory.com/83

@Controller
public class MainController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private MainServiceImpl mainService;

  @RequestMapping(value = "/")
  public String home(){
    logger.info("main page move");
    return "mainPage";
  }


  @RequestMapping(value = "/main/board")
  public ModelAndView mainPage(){
    logger.debug("DEBUG Level 테스트");
    logger.info("INFO Level 테스트");
    logger.warn("Warn Level 테스트");
    logger.error("ERROR Level 테스트");

    System.out.println("Check log ");

    ModelAndView mav = new ModelAndView();
    mav.addObject("message", "TEST TEXT");
    mav.setViewName("mainPage");

    return mav;
  }

  @RequestMapping(value = "/home")
  public String subPage(){
    return "contentsPage";
  }

  @RequestMapping(value = "/db_select")
  public String selectValue(Model model) throws Exception {
    logger.info("DB Connection Test");

    List<MainDTO> mainList = this.mainService.selectMainList();

    logger.info("GET DB Column");

    logger.info("MainList size : " + mainList.size());
    for(int i = 0; i < mainList.size(); i++) {
      System.out.println(mainList.get(i).getA());
      System.out.println(mainList.get(i).getData());
      System.out.println(mainList.get(i).getDate());
    }

    logger.info("Print DB Data");

    model.addAttribute("mainText", mainList.get(0).getA());
    model.addAttribute("mainData", mainList.get(0).getData());
    model.addAttribute("mainDate", mainList.get(0).getDate());

    logger.info("Return DB Data");

    return "contentsPage";
  }

}
