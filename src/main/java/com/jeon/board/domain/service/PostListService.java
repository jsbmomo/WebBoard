package com.jeon.board.domain.service;


import com.jeon.board.domain.dao.PostListDAO;
import com.jeon.board.domain.dto.PostListDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostListService {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private PostListDAO postListDAO;

  public List<PostListDTO> selectPostList() {
    logger.info("select from post list");
    return postListDAO.selectPostList();
  }

  public int insertPost(PostListDTO post) {
    logger.debug(post.toString());
    return postListDAO.insertPost(post);
  }
}
