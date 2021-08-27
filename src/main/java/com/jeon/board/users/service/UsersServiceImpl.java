package com.jeon.board.users.service;

import com.jeon.board.dto.UsersDTO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsersServiceImpl implements UsersService{

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String NAMESPACE = "com.joen.board.mappers.users.UsersMapper";

  @Autowired
  SqlSession sqlSession;

  @Override
  public List<UsersDTO> selectUserList() {
    logger.info("DTO START");

    return sqlSession.selectList(NAMESPACE + ".selectUserList");
  }
}
