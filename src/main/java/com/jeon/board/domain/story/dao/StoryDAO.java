package com.jeon.board.domain.story.dao;


import com.jeon.board.domain.story.dto.StoryDTO;

import java.util.List;


public interface StoryDAO {

  public List<StoryDTO> selectStoryList();

  public StoryDTO selectStoryContentOne(int value);

  public void insertStory(StoryDTO story);

  public int updateStory(StoryDTO story);

  public void removeStory(int seq);
}
