package com.jeon.board.mian.service;

import com.jeon.board.mian.dto.MainDTO;
import com.jeon.board.mian.dto.NoticeDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MainService {

  public List<NoticeDTO> noticeList(Map<String, Integer> page);

  public List<MainDTO> selectMainList();

  public MainDTO selectContents(int seq);

  public void insertContents(MainDTO contents);

  public int updateContents(int seq);

  public void removeContents(int seq);
}
