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
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/notice")
public class NoticeController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private NoticeServiceImpl noticeService;


  @RequestMapping(value = "")
  public ModelAndView noticeList() {
    Map<String, Integer> page = new HashMap<String, Integer>();
    page.put("count", 20);

    List<NoticeDTO> list = noticeService. selectNoticeAll(page);

    ModelAndView view = new ModelAndView();
    view.addObject("noticelist", view);
    view.setViewName("story");

    return view;
  }

  @RequestMapping(value = "/{seq}")
  public String boardContents(Model model, @PathVariable("seq") int uniqueNum) {
    NoticeDTO contents = noticeService.selectNoticeContent(uniqueNum);

    model.addAttribute("contents", contents);

    return "board/noticePage";
  }

  @RequestMapping(value = "/create")
  public void createNotice(NoticeDTO notice) {
    logger.info("create notice contents : " + notice.toString());

    noticeService.insertNotice(notice);

    logger.info("create notice contents : " + notice.toString());
  }

  @RequestMapping(value = "/update")
  public int updateNotice(NoticeDTO notice) {
    logger.info("insert notice contants : " + notice.toString());

    int result = noticeService.updateNotice(notice);

    return result;
  }
}
