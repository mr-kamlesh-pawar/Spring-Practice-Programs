package in.kamlesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.kamlesh.services.BankTransactions;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("/in/kamlesh/resouces/applicationContext.xml");
	
	BankTransactions bank= (BankTransactions) context.getBean("proxy");
	bank.transactionUsingUPI();
	bank.transactionUsingWallet();
	
}
}
