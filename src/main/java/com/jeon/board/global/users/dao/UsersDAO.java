package com.jeon.board.global.users.dao;

import com.jeon.board.global.users.dto.UsersDTO;

import java.util.List;

public interface UsersDAO {

  public List<UsersDTO> selectUserList();

}
