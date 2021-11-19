package com.jeon.board.reply.controller;


import com.jeon.board.reply.dto.ReplyDTO;
import com.jeon.board.reply.service.ReplyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping("/reply")
public class ReplyController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private ReplyService replyService;

  @PostMapping("/insert")
  public void additionalReply(@RequestBody ReplyDTO replyDTO) {

    logger.info("INSERT !!!" + replyDTO.toString());
    if (replyService.insertReply(replyDTO) == 1) {
      logger.info("INESRT Successful");
    } else {
      logger.info("INSERT FAILED");
    }
  }

  @RequestMapping("/delete/{seq}")
  public void removeReply(@PathVariable("seq") int seq) {
    replyService.deleteReply(seq);
  }

  @RequestMapping("/list")
  public @ResponseBody
  List<ReplyDTO>
  getReplyList(HttpServletRequest request, HttpServletResponse response) {

    return replyService.selectReplyList(7);
  }

}
