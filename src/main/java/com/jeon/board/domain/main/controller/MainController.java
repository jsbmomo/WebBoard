package com.jeon.board.domain.main.controller;


import com.jeon.board.domain.main.dto.MainDTO;
import com.jeon.board.domain.notice.dto.NoticeDTO;
import com.jeon.board.domain.main.service.MainServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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


/* 공지사항, 최신 게시물, 잡담, 일상, 토픽, 전공, 알람(메세지), 광고 */
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
  public String boardContents(Model model, @PathVariable("seq") int uniqueNum) {
    logger.info("======SELECT CONTNETS======");

    MainDTO contents = this.mainService.selectContents(uniqueNum);



    model.addAttribute("contents", contents);
//    mav.setViewName();

    return "board/noticePage";
  }




}
