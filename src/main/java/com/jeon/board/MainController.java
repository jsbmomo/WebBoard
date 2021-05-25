package com.jeon.board;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @RequestMapping(value = "/main/board")
  public ModelAndView mainPage(){
    logger.debug("DEBUG Level 테스트");
    logger.info("INFO Level 테스트");
    logger.warn("Warn Level 테스트");
    logger.error("ERROR Level 테스트");

    System.out.println("Check log ");

    ModelAndView mav = new ModelAndView();
    mav.addObject("message", "TEST TEXT");
    mav.setViewName("mainViewPage");
    return mav;
  }

  @RequestMapping(value = "/home")
  public String subPage(HttpRequest http){




    return "contentsPage";
  }

}
