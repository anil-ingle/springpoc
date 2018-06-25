package com.nt.service;

import com.nt.dto.UserDTO;

public interface LoginService {
   public String authenticate(UserDTO dto);  
}
