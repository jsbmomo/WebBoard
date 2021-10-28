package com.jeon.board.domain.notice.dao;

import com.jeon.board.domain.notice.dto.NoticeDTO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository("noticeDAO")
public class NoticeDaoImpl implements NoticeDAO {

  private static final String NAMESPACE = "com.joen.board.mappers.notice.NoticeMapper";
  private final Logger logger = LoggerFactory.getLogger(this.getClass());


  @Autowired
  private SqlSession sqlSession;

  @Override
  public List<NoticeDTO> selectNoticeAll(Map<String, Integer> page){
    return sqlSession.selectList(NAMESPACE + ".selectNoticeAll", page);
  }

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

  @Override
  public int updateNotice(NoticeDTO notice) {
    return sqlSession.update(NAMESPACE + "/updateNotice", notice);
  }
}
