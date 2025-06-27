package com.kp.springboot_jpa_01.config;

import java.io.IOException;
import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomSuccessHandler  implements AuthenticationSuccessHandler{

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {

                Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
                String redirectURL="/";

                for(GrantedAuthority auth : authorities){
                    String role= auth.getAuthority();

                    if (role.equals("ROLE_ADMIN")) {
                        redirectURL= "/admin/dashboard";
                        break;
                    }else if (role.equals("ROLE_USER")) {
                        redirectURL= "/user/dashboard";
                        break;
                    }
                   

                }

                response.sendRedirect(redirectURL);
         }
    
    
}
