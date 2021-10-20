package com.jeon.board.domain.story.dao;

import com.jeon.board.domain.story.dto.StoryDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("storyDAO")
public class StoryDAOImpl implements StoryDAO{

  private static final String NAMESPACE = "com.joen.board.mappers.story.Mapper";

  @Autowired
  private SqlSession session;

  @Override
  public StoryDTO selectStoryContentOne(int value) {
    return session.selectOne(NAMESPACE + ".selectStoryContentOne", value);
  }

}
