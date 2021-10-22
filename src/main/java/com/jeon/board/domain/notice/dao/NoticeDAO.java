package com.jeon.board.domain.notice.dao;

import com.jeon.board.domain.notice.dto.NoticeDTO;

public interface NoticeDAO {

  public NoticeDTO selectNoticeContent(int seqNum);

  public void insertNotice(NoticeDTO notice);

  public int updateNotice(NoticeDTO notice);

}
