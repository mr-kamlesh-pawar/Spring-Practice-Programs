package com.kp.springboot_jpa_01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.kp.springboot_jpa_01.model.UserEntity;
import com.kp.springboot_jpa_01.repository.UserRepository;

@Service
public class UserService {

   @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public void saveUser( UserEntity user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);
    }

    public void updateUser( UserEntity user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);        
    }

    public void deleteUser( int id){
        repository.deleteById(id);
    }

    public Optional<UserEntity> getUser(int id){
       return  repository.findById(id);
    }

    public List<UserEntity> getAllUsers(){
        return repository.findAll();
    }
    

}
