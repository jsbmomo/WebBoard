package com.jeon.board.domain.dao;


import com.jeon.board.domain.dto.PostListDTO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class PostListDAO {

  private static final String NAMESPACE = "com.jeon.board.domain.dao.PostListDAO";
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Resource
  SqlSession sqlSession;

  public List<PostListDTO> selectPostList() {
    logger.info("select from post list");
    return sqlSession.selectList(NAMESPACE + ".selectPostList");
  }

  @Transactional
  public int insertPost(PostListDTO post) {
    logger.debug(post.toString());
    return sqlSession.insert(NAMESPACE + ".insertPost");
  }

}
