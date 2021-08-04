package com.jeon.board.dao;


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
  SqlSession sqlSession;

  @Override
  public List<MainDTO> selectMainList() {
    logger.info("DTO START");

    return sqlSession.selectList(NAMESPACE + ".selectMainList");
  }


}
