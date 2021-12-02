package com.jeon.board.domain.controller;


import com.jeon.board.domain.dto.NoticeDTO;
import com.jeon.board.domain.dto.PostListDTO;
import com.jeon.board.domain.service.MainService;
import com.jeon.board.domain.service.NoticeService;
import com.jeon.board.domain.service.PostListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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

  @Autowired
  private PostListService postListService;

  @GetMapping(value = "")
  public String mainPage(HttpServletRequest request, ModelAndView mav) {
    logger.info("main page");

    Map<String, Object> result = new HashMap<String, Object>();
    result.put("noticeList", noticeService.selectNoticeAll());

    mav.addObject("mainPage", mav);

    return "board/mainPage";
  }

  @PostMapping(value="/dashboard")
  public @ResponseBody Map<String, Object> dashboard(Model model) {

    logger.info("INPUT Dashboard");
    Map<String, Object> result = new HashMap<String, Object>();

    List<NoticeDTO> noticeFixList = noticeService.selectNoticeAll();

    result.put("notice", noticeFixList);

    return result;
  }

  @GetMapping(value = "/test")
  public @ResponseBody Map<String, Object> testPostList() {
    logger.info("Post List json");

    Map<String, Object> result = new HashMap<String, Object>();
    result.put("return", postListService.selectPostList());

    return result;
  }

  @PostMapping(value = "/input")
  public void insertPost() {
    logger.info("Post Insert");

    PostListDTO postDto = new PostListDTO();
    postDto.setTitle("제목 입력");
    postDto.setWriter("admin");
    postDto.setContent("Test 공지사항");
    postDto.setKind("NOTICE");
    postDto.setSecret('N');
    postDto.setUseAt('Y');

    int result = postListService.insertPost(postDto);
    logger.info("Code(int) : " + result);

    if (result == 1) {
      logger.info("INSERT Success");
    } else {
      logger.info("INSERT FAILED");
    }

  }

}
