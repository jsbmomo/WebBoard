package com.jeon.board.mian.service;


import com.jeon.board.mian.dto.MainDTO;
import com.jeon.board.mian.dao.MainDAO;
import com.jeon.board.notice.dto.NoticeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class MainServiceImpl implements MainService {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private static final String NAMESPACE = "com.joen.board.mappers.main.MainMapper";

  @Autowired
  private MainDAO dao;

  @Override
  public List<NoticeDTO> noticeList(Map<String, Integer> page) {
    return dao.noticeList(page);
  }

  @Override
  public List<MainDTO> selectMainList(){
    logger.info("MainServiceImpl print");
    return dao.selectMainList();
  }

  @Override
  public MainDTO selectContents(int seq) {
    return dao.selectContents(seq);
  }

  @Override
  public void insertContents(MainDTO contents) {
    dao.insertContents(contents);
  }

  @Override
  public int updateContents(int seq) {
    return dao.updateContents(seq);
  }

  @Override
  public void removeContents(int seq) {
    dao.removeContents(seq);
  }
}
