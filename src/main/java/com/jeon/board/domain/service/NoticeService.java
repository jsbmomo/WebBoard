package com.jeon.board.domain.service;


import com.jeon.board.domain.dao.NoticeDAO;
import com.jeon.board.domain.dto.NoticeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NoticeService {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String NAMESPACE = "com.jeon.board.mappers.notice.NoticeMapper";

  @Autowired
  private NoticeDAO dao;

  public List<NoticeDTO> selectNoticeAll(){
    logger.info("select notice content all : ");
    return dao.selectNoticeAll();
  }

  public NoticeDTO selectNoticeContent(int seqNum) {
    logger.info("select Notice contents : " + seqNum);
    return dao.selectNoticeContent(seqNum);
  }

  public int insertNotice(NoticeDTO notice) {
    return dao.insertNotice(notice);
  }

  public int updateNotice(NoticeDTO notice) {
    return dao.updateNotice(notice);
  }

  public void removeNotice(int seqNum) {
    dao.removeNotice(seqNum);
  }
}




