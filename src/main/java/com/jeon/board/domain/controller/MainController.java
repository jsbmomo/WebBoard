package com.jeon.board.domain.controller;


import com.jeon.board.domain.dto.NoticeDTO;
import com.jeon.board.domain.service.MainService;
import com.jeon.board.domain.service.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/* 공지사항, 최신 게시물, 잡담, 일상, 토픽, 전공, 알람(메세지), 광고 */
@Controller
@RequestMapping(value = "/main")
public class MainController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private MainService mainService;

  @Autowired
  private NoticeService noticeService;

  @RequestMapping(value = "")
  public ModelAndView mainPage() {
    logger.info("main page");

    /* 상위 5개의 공지사항을 가져오기 위해 작성 */
    Map<String, Integer> page = new HashMap<String, Integer>();
    page.put("start", 0);
    page.put("count", 5);

    logger.info("START : " + page.size());

    List<NoticeDTO> nc = noticeService.selectNoticeAll(page);
//    List<MainDTO> nc = mainService.selectMainList();

    logger.debug("SIZE : " + nc.size());
    logger.debug("DATA : " + nc.get(0).toString());

    ModelAndView mv = new ModelAndView();
    mv.addObject("notice", nc);
    mv.setViewName("board/mainPage");

    return mv;
  }


  @RequestMapping(value = "/call")
  public void callApi(@RequestBody Map<String, Object> value) {
    logger.info("value : " + value.get("title"));
  }

  @PostMapping("/call-post")
  public void callPost(@RequestBody Map<String, Object> value) {
    logger.info("value : " + value.get("title"));
  }

  @RequestMapping(value = "/call-api")
  public void callApi(NoticeDTO value) {
    logger.info("value : " + value.toString());
  }

  

}
