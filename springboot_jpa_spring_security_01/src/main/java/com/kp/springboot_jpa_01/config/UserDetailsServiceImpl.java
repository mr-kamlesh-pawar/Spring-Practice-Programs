package com.kp.springboot_jpa_01.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kp.springboot_jpa_01.model.UserEntity;
import com.kp.springboot_jpa_01.repository.UserRepository;

@Service
public class UserDetailsServiceImpl  implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     //fetching user from database

    UserEntity user=  userRepository.getUserEntityByEmail(username);

    if (user == null){
        throw new UsernameNotFoundException("User not found");
    }

    CustomUserDetails customUserDetails = new CustomUserDetails(user);
     
     return customUserDetails;
        //   throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }
    
}
