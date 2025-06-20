package in.kp.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages ="in.kp.controllers")
public class WebConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
	
		InternalResourceViewResolver ivr= new InternalResourceViewResolver();
		ivr.setPrefix("WEB-INF/views/");
		ivr.setSuffix(".jsp");
		
		
		return ivr;
	}

	
}
