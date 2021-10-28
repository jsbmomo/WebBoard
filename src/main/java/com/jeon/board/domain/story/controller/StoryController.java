package com.jeon.board.domain.story.controller;

import com.jeon.board.domain.story.service.StoryServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/story")
public class StoryController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private StoryServiceImpl service;

  @RequestMapping(value = "")
  public void storyList() {
//    Map<String, Integer> list =
  }



}
