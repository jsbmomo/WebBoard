package com.jeon.board.notice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping(value = "/notice")
@Controller
public class NoticeController {

  @RequestMapping(value = "/{noticeSeq}")
  public String noticeContent(@PathVariable String noticeSeq) {

    Map<String, Object> result = new HashMap<String, Object>();



    return "";
  }

}
