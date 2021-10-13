package com.jeon.board.notice.controller;


import com.jeon.board.mian.dto.MainDTO;
import com.jeon.board.mian.service.MainServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/notice")
public class NoticeController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private MainServiceImpl mainService;


  @RequestMapping(value = "/{seq}")
  public String boardContents(Model model, @PathVariable("seq") int uniqueNum) {
    logger.info("======SELECT CONTNETS======");

    MainDTO contents = this.mainService.selectContents(uniqueNum);



    model.addAttribute("contents", contents);
//    mav.setViewName();

    return "board/noticePage";
  }

}
