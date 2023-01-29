package com.sha.springbootmicroservice3apigateway.security;

import com.sha.springbootmicroservice3apigateway.model.User;
import com.sha.springbootmicroservice3apigateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findUserByUserName(username);

        return new CustomUserDetails(user);
    }
}
