package com.jeon.board.users.service;

import com.jeon.board.dto.UsersDTO;

import java.util.List;

public interface UsersService {

  public List<UsersDTO> selectUserList();

}
