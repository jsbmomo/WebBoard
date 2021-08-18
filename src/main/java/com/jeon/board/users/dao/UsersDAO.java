package com.jeon.board.users.dao;

import com.jeon.board.dto.UsersDTO;

import java.util.List;

public interface UsersDAO {

  public List<UsersDTO> selectUserList();

}
