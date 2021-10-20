package com.jeon.board.domain.story.dao;


import com.jeon.board.domain.story.dto.StoryDTO;


public interface StoryDAO {

  public StoryDTO selectStoryContentOne(int value);

}
