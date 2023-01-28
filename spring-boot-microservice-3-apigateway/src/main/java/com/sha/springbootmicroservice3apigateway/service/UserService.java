package com.sha.springbootmicroservice3apigateway.service;

import com.sha.springbootmicroservice3apigateway.model.Role;
import com.sha.springbootmicroservice3apigateway.model.User;

public interface UserService {
    User saveUser(User user);

    User findUserByUserName(String username);

    void changeRole(Role newRole, String username);
}
