package com.jeon.board.domain.dao;

import com.jeon.board.domain.dto.StoryDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository("storyDAO")
public class StoryDAO {

  private static final String NAMESPACE = "com.joen.board.mappers.story.Mapper";

  @Resource(name = "sqlSession")
  private SqlSession session;

  public List<StoryDTO> selectStoryList() {
    return session.selectList(NAMESPACE + ".selectStoryList");
  }

  public StoryDTO selectStoryContentOne(int value) {
    return session.selectOne(NAMESPACE + ".selectStoryContentOne", value);
  }

  public void insertStory(StoryDTO story) {
    session.insert(NAMESPACE + ".insertStory", story);
  }

  public int updateStory(StoryDTO story) {
    return session.update(NAMESPACE + ".updateStory", story);
  }

  public void removeStory(int seq) {
    session.delete(NAMESPACE + ".removeStory", seq);
  }

}
