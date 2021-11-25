package com.jeon.board.domain.controller;


import com.jeon.board.domain.dto.NoticeDTO;
import com.jeon.board.domain.service.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Test {
  private List<Integer> ids;
  private String name;
}

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private NoticeService noticeService;


  @RequestMapping(value = "")
  public ModelAndView noticeList() {
    Map<String, Integer> page = new HashMap<String, Integer>();
    page.put("count", 20);

    List<NoticeDTO> list = noticeService. selectNoticeAll();

    ModelAndView view = new ModelAndView();
    view.addObject("noticelist", view);
    view.setViewName("board/noticePage"); /// /

    return view;
  }

  @RequestMapping(value = "/{seq}")
  public String noticeContents(Model model, @PathVariable("seq") int uniqueNum) {
    NoticeDTO contents = noticeService.selectNoticeContent(uniqueNum);

    model.addAttribute("contents", contents);

    return "board/noticePage";
  }

  @GetMapping(value = "/test")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void test(@RequestParam("title") String test) {
    logger.info("test : {}", test);
  }

  //
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  @RequestMapping(path="/insert", produces="application/json", consumes = "application/json")
  public void insertNotice(@RequestBody Map<String, Object> notice) {

    Map<String, Object> test = new HashMap<String, Object>();
//    NoticeDTO result = notice;


    logger.info("INSERT : " + notice.get("title"));

//    return result;
  }

  @PostMapping(value = "/create", consumes = {"application/json"})
  public ResponseEntity<String> createNotice(@RequestBody NoticeDTO notice) throws Exception {

    logger.info("create notice contents : " + notice.toString());

    Map<String, String> result = new HashMap<String, String>();
    result.put("result", notice.toString());
//    if (noticeService.insertNotice(notice) == 1) {
//      result.put("result", "success");
//    } else {
//      result.put("result", "failed");
//    }

    HttpHeaders resHeader = new HttpHeaders();
    resHeader.add("Content-Type", "application/json;charset=UTF-8");

    return new ResponseEntity<String>(notice.toString() != null ? notice.toString() : "falied", resHeader, HttpStatus.OK);
  }

  @PostMapping(value = "/update")
  public int updateNotice(NoticeDTO notice) {
    logger.info("insert notice contants : " + notice.toString());


    int result = noticeService.updateNotice(notice);

    return result;
  }

  @RequestMapping(value = "/remove/{seq}")
  public void removeNotice(@PathVariable("seq") int uniqueNum) {
    noticeService.removeNotice(uniqueNum);
  }
}
