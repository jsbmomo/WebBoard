package com.jeon.board.mian.service;

import com.jeon.board.dto.MainDTO;

import java.util.List;

public interface MainService {

  public List<MainDTO> selectMainList();

  public MainDTO selectContents(int seq);

  public void insertContents(MainDTO contents);

  public int updateContents(int seq);

  public void removeContents(int seq);
}
