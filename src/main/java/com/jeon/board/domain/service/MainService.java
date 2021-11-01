package com.jeon.board.domain.service;


import com.jeon.board.domain.dao.MainDAO;
import com.jeon.board.domain.dto.MainDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MainService {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String NAMESPACE = "com.joen.board.mappers.main.MainMapper";

  @Autowired
  private MainDAO dao;

  public List<MainDTO> selectMainList(){
    logger.info("MainServiceImpl print");
    return dao.selectMainList();
  }

  public MainDTO selectContents(int seq) {
    return dao.selectContents(seq);
  }

  public void insertContents(MainDTO contents) {
    dao.insertContents(contents);
  }

  public int updateContents(int seq) {
    return dao.updateContents(seq);
  }

  public void removeContents(int seq) {
    dao.removeContents(seq);
  }
}
