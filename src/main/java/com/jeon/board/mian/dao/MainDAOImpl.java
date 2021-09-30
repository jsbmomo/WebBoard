package com.jeon.board.mian.dao;


import com.jeon.board.dto.MainDTO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("mainDAO")
public class MainDAOImpl implements MainDAO {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String NAMESPACE = "com.joen.board.mappers.main.MainMapper";

  @Autowired
  private SqlSession sqlSession;

  @Override
  public List<MainDTO> selectMainList() {
    logger.info("DTO START");
    return sqlSession.selectList(NAMESPACE + ".selectMainList");
  }

  @Override
  public MainDTO selectContents(int seq) {
    return sqlSession.selectOne(NAMESPACE + ".selectContents", seq);
  }

  @Override
  public void insertContents(MainDTO contents) {
    sqlSession.insert(NAMESPACE + ".insertContents", contents);
  }

  @Override
  public int updateContents(int seq) {
    return sqlSession.update(NAMESPACE + ".updateContents", seq);
  }

  @Override
  public void removeContents(int seq) {
    logger.info("REMOVE");
    sqlSession.delete(NAMESPACE + ".removeContents", seq);
  }



}
