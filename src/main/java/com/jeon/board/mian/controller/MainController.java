package com.jeon.board.mian.controller;


import com.jeon.board.mian.dto.MainDTO;
import com.jeon.board.mian.dto.NoticeDTO;
import com.jeon.board.mian.service.MainServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/main")
public class MainController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private MainServiceImpl mainService;

  @RequestMapping(value = "")
  public ModelAndView mainPage() {
    logger.info("main page");

    Map<String, Integer> page = new HashMap<String, Integer>();
    page.put("start", 0);
    page.put("count", 5);

    logger.info("START : " + page.size());

    List<NoticeDTO> nc = mainService.noticeList(page);
//    List<MainDTO> nc = mainService.selectMainList();

    logger.debug("SIZE : " + nc.size());
    logger.debug("DATA : " + nc.get(0).toString());

    ModelAndView mv = new ModelAndView();
    mv.addObject("notice", nc);
    mv.setViewName("board/mainPage");

    return mv;
  }

  @RequestMapping(value = "/notice")
  public ModelAndView notice(HttpServletRequest request, HttpServletResponse response){
    logger.debug("DEBUG Level 테스트");
    logger.info("INFO Level 테스트");
    logger.warn("Warn Level 테스트");
    logger.error("ERROR Level 테스트");

    Map<String, String> page = new HashMap<String, String>();

    logger.debug(request.getParameter("start"));
    logger.debug(request.getParameter("count"));


//
//    page.put("start", request.getParameter("start");
//    page.put("count", request.getParameter("count");;
//    mainService.noticeList();

    ModelAndView mav = new ModelAndView();
    mav.addObject("message", "TEST TEXT");
    mav.setViewName("board/mainPage");

    return mav;
  }

  @RequestMapping(value = "/board/{seq}")
  public ModelAndView boardContents(@PathVariable("seq") int uniqueNum) {
    logger.info("======SELECT CONTNETS======");

    MainDTO contents = this.mainService.selectContents(uniqueNum);

    ModelAndView mav = new ModelAndView();
    mav.addObject("contents", contents);
    mav.setViewName("board/noticePage");

    return mav;
  }

  @RequestMapping(value = "/home")
  public String subPage(){
    return "board/contentsPage";
  }


  @RequestMapping(value = "/db_select")
  public String selectValue(Model model) throws Exception {
    logger.info("DB Connection Test");

    List<MainDTO> mainList = this.mainService.selectMainList();

    logger.info("GET DB Column");

    logger.info("MainList size : " + mainList.size());
    for(int i = 0; i < mainList.size(); i++) {
      System.out.println(mainList.get(i).getSeq());
      System.out.println(mainList.get(i).getTitle());
      System.out.println(mainList.get(i).getWriter());
      System.out.println(mainList.get(i).getContent());
      System.out.println(mainList.get(i).getRegDate());
      System.out.println(mainList.get(i).getCnt());
    }

    logger.info("Print DB Data");

    model.addAttribute("mainSeq", mainList.get(0).getSeq());
    model.addAttribute("mainTitle", mainList.get(0).getTitle());
    model.addAttribute("mainWriter", mainList.get(0).getWriter());
    model.addAttribute("mainContent", mainList.get(0).getContent());
    model.addAttribute("mainData", mainList.get(0).getRegDate());
    model.addAttribute("mainCnt", mainList.get(0).getCnt());

    logger.info("Return DB Data");

    return "board/contentsPage";
  }

}
