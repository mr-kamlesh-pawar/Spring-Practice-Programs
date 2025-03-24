package in.kamlesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.kamlesh.services.BankTransaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/kamlesh/resources/applicationContext.xml");
        
    
        BankTransaction bt= (BankTransaction) context.getBean("bankTransId");
        
        bt.transactionMobileBanking();
        bt.transactionUPI();
        bt.transactionWallet();
        
    
     }
}
