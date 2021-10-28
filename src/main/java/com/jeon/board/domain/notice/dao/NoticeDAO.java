package com.jeon.board.domain.notice.dao;

import com.jeon.board.domain.notice.dto.NoticeDTO;

import java.util.List;
import java.util.Map;

public interface NoticeDAO {

  public List<NoticeDTO> selectNoticeAll(Map<String, Integer> page);

  public NoticeDTO selectNoticeContent(int seqNum);

  public void insertNotice(NoticeDTO notice);

  public int updateNotice(NoticeDTO notice);

}
