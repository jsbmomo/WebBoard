package com.jeon.board.notice.service;


import com.jeon.board.mian.dao.MainDAO;
import com.jeon.board.mian.dto.MainDTO;
import com.jeon.board.notice.dao.NoticeDAO;
import com.jeon.board.notice.dto.NoticeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class NoticeServiceImpl implements  NoticeService{

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String NAMESPACE = "com.joen.board.mappers.main.MainMapper";

  @Autowired
  private NoticeDAO dao;

  @Override
  public NoticeDTO selectNoticeContent(int seqNum) {
    return dao.selectNoticeContent(seqNum);
  }

}




