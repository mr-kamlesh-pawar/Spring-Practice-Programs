package in.kp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import in.kp.aspects.LoggingAspects;
import in.kp.services.BankTransactions;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfigFile {
	@Bean
	public BankTransactions BTObj() {
		return new BankTransactions();
	}
	
	@Bean
	public LoggingAspects LAObj() {
		 return new LoggingAspects();
	}
	

}
