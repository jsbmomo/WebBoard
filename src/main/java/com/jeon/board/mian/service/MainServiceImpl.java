package com.jeon.board.mian.service;


import com.jeon.board.dto.MainDTO;
import com.jeon.board.mian.dao.MainDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String NAMESPACE = "com.joen.board.mappers.main.MainMapper";

  @Autowired
  private MainDAO dao;

  @Override
  public List<MainDTO> selectMainList(){
    logger.info("MainServiceImpl print");
    return dao.selectMainList();
  }
}
