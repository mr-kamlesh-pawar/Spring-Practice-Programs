package in.kp.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//replacemet of myds-servlet.xml file
@Configuration
@ComponentScan(basePackages = "in.kp.controllers")
public class WebConfig {
	
	@Bean
	public InternalResourceViewResolver myViewresolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
