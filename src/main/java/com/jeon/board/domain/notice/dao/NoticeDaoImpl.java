package com.jeon.board.domain.notice.dao;

import com.jeon.board.domain.notice.dto.NoticeDTO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("noticeDAO")
public class NoticeDaoImpl implements NoticeDAO {

  private static final String NAMESPACE = "com.joen.board.mappers.notice.NoticeMapper";
  private final Logger logger = LoggerFactory.getLogger(this.getClass());


  @Autowired
  private SqlSession sqlSession;


  @Override
  public NoticeDTO selectNoticeContent(int seqNum) {
    logger.info("select Notice contents : " + seqNum);
    return sqlSession.selectOne(NAMESPACE + ".selectNoticeContent", seqNum);
  }

  @Override
  public void insertNotice(NoticeDTO notice) {
    logger.info("create notice contents : " + notice.toString());
    sqlSession.insert(NAMESPACE + ".selectNoticeContent", notice);
  }
}
