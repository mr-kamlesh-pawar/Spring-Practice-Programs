package com.kp.springboot_jpa_01.config;

import java.util.Collection;
import java.util.List;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.kp.springboot_jpa_01.model.UserEntity;

public class CustomUserDetails  implements UserDetails{
    
    UserEntity user;

    public CustomUserDetails(UserEntity user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        
        SimpleGrantedAuthority simpleGrantedAuthority= new SimpleGrantedAuthority("ROLE_" +user.getRole());
        
        return List.of(simpleGrantedAuthority);    
    }

    @Override
    public String getPassword() {
        
        return user.getPassword();
    
    }

    @Override
    public String getUsername() {
       return user.getEmail();
    }

    @Override
public boolean isAccountNonExpired() {
    return true;
}

@Override
public boolean isAccountNonLocked() {
    return true;
}

@Override
public boolean isCredentialsNonExpired() {
    return true;
}

@Override
public boolean isEnabled() {
    return true;
}

    
}
