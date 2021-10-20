package com.jeon.board.global.users.service;

import com.jeon.board.global.users.dto.UsersDTO;

import java.util.List;

public interface UsersService {

  public List<UsersDTO> selectUserList();

}
