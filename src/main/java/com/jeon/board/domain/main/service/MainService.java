package com.jeon.board.domain.main.service;

import com.jeon.board.domain.main.dto.MainDTO;
import com.jeon.board.domain.notice.dto.NoticeDTO;

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
