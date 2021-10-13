package com.jeon.board.notice.dao;

import com.jeon.board.notice.dto.NoticeDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public class NoticeDaoImpl implements NoticeDAO {

  private static final String NAMESPACE = "com.joen.board.mappers.main.MainMapper";

  @Autowired
  private SqlSession sqlSession;


  @Override
  public NoticeDTO selectNoticeContent(int seqNum) {
    return sqlSession.selectOne(NAMESPACE + ".noticeList", seqNum);
  }


}
