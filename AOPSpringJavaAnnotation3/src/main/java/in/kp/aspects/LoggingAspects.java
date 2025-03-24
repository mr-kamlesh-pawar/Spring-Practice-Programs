package in.kp.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspects {
	
	@Around("execution(* in.kp.services.BankTransactions.transactionNetBanking(..))")
	public void myLogging(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("------logging service  before-------");
		joinPoint.proceed();
		
		System.out.println("logging service after");
	}
}
