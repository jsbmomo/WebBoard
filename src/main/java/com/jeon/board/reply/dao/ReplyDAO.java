package com.jeon.board.reply.dao;


import com.jeon.board.reply.dto.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyDAO {

  public int insertReply(ReplyDTO reply);

  public int deleteReply(int replyNum);

  public List<ReplyDTO> selectReplyList(int contentsNum);

}
