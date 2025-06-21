package in.kp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//replacement of spring security.xml file

@EnableWebSecurity
@ComponentScan(basePackages = "in.kp.controllers")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
	
		@SuppressWarnings("deprecation")
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http
				.authorizeRequests()
					.antMatchers("/adminPanel").hasRole("ADMIN")
					.and()
				.httpBasic();
		}
		
		 @Bean
		    public UserDetailsService userDetailsService() {
		        UserDetails admin = User.withUsername("admin")
		            .password("$2a$12$Yl/v4tAIkFAQpchbJ2BZ1OWWMPYRbe5tmpf7uWULZTKotEnBjoh3S") // bcrypt
		            .roles("ADMIN")
		            .build();

		        return new InMemoryUserDetailsManager(admin);
		    }
		 
		 @Bean
		 public PasswordEncoder passwordEncoder() {
		     return new BCryptPasswordEncoder();
		 }

}	
