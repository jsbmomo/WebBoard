package com.jeon.board.domain.controller;


import com.jeon.board.domain.dto.NoticeDTO;
import com.jeon.board.domain.service.MainService;
import com.jeon.board.domain.service.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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

  @GetMapping(value = "")
  public String mainPage() {
    logger.info("main page");
    return "board/mainPage";
  }

  @PostMapping(value="/dashboard")
  public Map<String, Object> dashboard(Model model) {
    Map<String, Object> result = new HashMap<String, Object>();

    List<NoticeDTO> noticeFixList = noticeService.selectNoticeAll();

    result.put("notice", noticeFixList);

    return result;
  }

//  @PostMapping(value="/notice/fix")
//  public List<NoticeDTO> mainService() {
//
//    return mav;
//  }

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
