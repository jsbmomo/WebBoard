package com.jeon.board.domain.notice.controller;


import com.jeon.board.domain.notice.dto.NoticeDTO;
import com.jeon.board.domain.notice.service.NoticeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private NoticeServiceImpl noticeService;


  @RequestMapping(value = "/{seq}")
  public String boardContents(Model model, @PathVariable("seq") int uniqueNum) {
    logger.info("======SELECT Notice======");

    NoticeDTO contents = this.noticeService.selectNoticeContent(uniqueNum);

    model.addAttribute("contents", contents);

    return "board/noticePage";
  }

  @RequestMapping(value = "/create")
  public void createNotice(NoticeDTO notice) {
    logger.info("create notice contents : " + notice.toString());

    this.noticeService.insertNotice(notice);

    logger.info("create notice contents : " + notice.toString());
  }

  @RequestMapping(value = "/update")
  public int updateNotice(NoticeDTO notice) {
    logger.info("insert notice contants : " + notice.toString());

    int result = this.noticeService.updateNotice(notice);

    return result;
  }
}
