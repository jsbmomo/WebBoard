package com.jeon.board.domain.story.service;

import com.jeon.board.domain.story.dao.StoryDAO;
import com.jeon.board.domain.story.dto.StoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StoryServiceImpl implements StoryService{

  @Autowired
  private StoryDAO storyDao;


  public StoryDTO selectStoryContentOne(int value) {
    return storyDao.selectStoryContentOne(value);
  }

}
