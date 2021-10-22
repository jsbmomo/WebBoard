package com.jeon.board.domain.notice.service;

import com.jeon.board.domain.notice.dto.NoticeDTO;

public interface NoticeService {

  public NoticeDTO selectNoticeContent(int seqNum);

  public void insertNotice(NoticeDTO notice);

  public int updateNotice(NoticeDTO notice);
}
