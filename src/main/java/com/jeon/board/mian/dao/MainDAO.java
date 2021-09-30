package com.jeon.board.mian.dao;

import com.jeon.board.dto.MainDTO;

import java.util.List;

public interface MainDAO {

  public List<MainDTO> selectMainList();

  public MainDTO selectContents(int seq);

  public void insertContents(MainDTO contents);

  public int updateContents(int seq);

  public void removeContents(int seq);

}
