package com.jeon.board.notice.service;

import com.jeon.board.notice.dto.NoticeDTO;

public interface NoticeService {

  public NoticeDTO selectNoticeContent(int seqNum);

  public void insertNotice(NoticeDTO notice);
}
