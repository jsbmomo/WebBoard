package com.jeon.board.reply.service;


import com.jeon.board.reply.dto.ReplyDTO;

import java.util.List;


public interface ReplyService {

  public int insertReply(ReplyDTO reply);

  public int deleteReply(int replyNum);

  public List<ReplyDTO> selectReplyList(int contentsNum);

}
