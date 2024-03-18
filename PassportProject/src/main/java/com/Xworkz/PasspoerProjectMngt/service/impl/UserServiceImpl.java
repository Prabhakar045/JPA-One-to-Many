package com.Xworkz.PasspoerProjectMngt.service.impl;

import com.Xworkz.PasspoerProjectMngt.dto.UserDTO;
import com.Xworkz.PasspoerProjectMngt.repository.UserRepository;
import com.Xworkz.PasspoerProjectMngt.repository.impl.UserRepositoryImpl;
import com.Xworkz.PasspoerProjectMngt.service.UserService;

public class UserServiceImpl implements UserService {

   UserRepository userRepository;

    public UserServiceImpl() {
        userRepository = new UserRepositoryImpl();
    }

    public boolean validateAndAddUserRegistration(UserDTO dto) {
        System.out.println("service validation layer ");
        if (dto != null) {
            userRepository.addUserRegistration(dto);
            return true;
        }

        return false;
    }
}
