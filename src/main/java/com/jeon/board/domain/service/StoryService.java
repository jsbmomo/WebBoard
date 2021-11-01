package com.jeon.board.domain.service;

import com.jeon.board.domain.dao.StoryDAO;
import com.jeon.board.domain.dto.StoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StoryService {

  @Autowired
  private StoryDAO storyDao;

  public List<StoryDTO> selectStoryList(){
    return storyDao.selectStoryList();
  }

  public StoryDTO selectStoryContentOne(int value) {
    return storyDao.selectStoryContentOne(value);
  }

  public void insertStory(StoryDTO story){
    storyDao.insertStory(story);
  }

  public int updateStory(StoryDTO story){
    return storyDao.updateStory(story);
  }

  public void removeStory(int seq){
    storyDao.removeStory(seq);
  }

}
