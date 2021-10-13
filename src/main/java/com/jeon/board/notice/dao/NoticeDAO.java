package com.jeon.board.notice.dao;

import com.jeon.board.notice.dto.NoticeDTO;

public interface NoticeDAO {

  public NoticeDTO selectNoticeContent(int seqNum);

}
