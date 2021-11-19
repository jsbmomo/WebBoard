package com.jeon.board.reply.service.impl;

import com.jeon.board.reply.dao.ReplyDAO;
import com.jeon.board.reply.dto.ReplyDTO;
import com.jeon.board.reply.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReplyServiceImpl implements ReplyService {

  @Autowired
  private ReplyDAO replyDAO;

  public int insertReply(ReplyDTO reply) {
    return replyDAO.insertReply(reply);
  }

  public int deleteReply(int replyNum) {
    return replyDAO.deleteReply(replyNum);
  }

  public List<ReplyDTO> selectReplyList(int contentsNum) {
    return replyDAO.selectReplyList(contentsNum);
  }


}
