package com.jeon.board.domain.dao;


import com.jeon.board.domain.dto.MainDTO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("mainDAO")
public class MainDAO {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String NAMESPACE = "com.joen.board.mappers.main.MainMapper";

  @Resource(name = "sqlSession")
  private SqlSession sqlSession;

  public List<MainDTO> selectMainList() {
    logger.info("DTO START");
    return sqlSession.selectList(NAMESPACE + ".selectMainList");
  }

  public MainDTO selectContents(int seq) {
    return sqlSession.selectOne(NAMESPACE + ".selectContents", seq);
  }

  public void insertContents(MainDTO contents) {
    sqlSession.insert(NAMESPACE + ".insertContents", contents);
  }

  public int updateContents(int seq) {
    return sqlSession.update(NAMESPACE + ".updateContents", seq);
  }

  public void removeContents(int seq) {
    logger.info("REMOVE");
    sqlSession.delete(NAMESPACE + ".removeContents", seq);
  }



}
