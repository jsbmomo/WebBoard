package com.jeon.board.domain.dao;

import com.jeon.board.domain.dto.NoticeDTO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository("noticeDAO")
public class NoticeDAO {

  private static final String NAMESPACE = "com.joen.board.mappers.notice.NoticeMapper";
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private SqlSession sqlSession;

  public List<NoticeDTO> selectNoticeAll(Map<String, Integer> page){
    return sqlSession.selectList(NAMESPACE + ".selectNoticeAll", page);
  }

  public NoticeDTO selectNoticeContent(int seqNum) {
    logger.info("select Notice contents : " + seqNum);
    return sqlSession.selectOne(NAMESPACE + ".selectNoticeContent", seqNum);
  }

  public int insertNotice(NoticeDTO notice) {
    logger.info("create notice contents : " + notice.toString());
    return sqlSession.insert(NAMESPACE + ".selectNoticeContent", notice);
  }

  public int updateNotice(NoticeDTO notice) {
    return sqlSession.update(NAMESPACE + "/updateNotice", notice);
  }

  public void removeNotice(int seqNum) {
    sqlSession.delete(NAMESPACE + "/removeNotice", seqNum);
  }
}
