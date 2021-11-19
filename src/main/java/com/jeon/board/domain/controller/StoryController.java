package com.jeon.board.domain.controller;

import com.jeon.board.domain.dto.StoryDTO;
import com.jeon.board.domain.service.StoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/story")
public class StoryController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private StoryService service;

  @RequestMapping(value = "")
  public ModelAndView storyList() {

    service.selectStoryList();

    ModelAndView view = new ModelAndView();
    view.addObject(view);
    view.setViewName("story");

    return view;
  }


  @RequestMapping(value = "/{seq}")
  public String storyContents(Model model, @PathVariable("seq") int uniqueNum) {
    StoryDTO story = service.selectStoryContentOne(uniqueNum);

    model.addAttribute("story", story);

    return "board/story";
  }


  @RequestMapping(value = "/update")
  public int updateStory(StoryDTO story) {
    int result = service.updateStory(story);

    return result;
  }


  @RequestMapping(value = "/create")
  public void createStory(StoryDTO story) {
    service.insertStory(story);
  }

  @RequestMapping(value = "/remove/{seq}")
  public void removeStory(@PathVariable("seq") int uniqueNum) {
    service.removeStory(uniqueNum);
  }


}
