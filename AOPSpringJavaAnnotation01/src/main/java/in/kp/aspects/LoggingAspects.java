package in.kp.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspects {
	
	@Before("execution(* in.kp.services.BankTransactions.*(..))")
	public void myLogging() {
		System.out.println("------logging service -------");
	}
}
