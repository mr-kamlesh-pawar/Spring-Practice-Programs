package in.kp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.kp.resources.SpringConfigFile;
import in.kp.services.BankTransactions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        BankTransactions bt= (BankTransactions) context.getBean("BTObj");
        
        bt.transactionNetBanking();
        System.out.println();
        bt.transactionUPI();
    }
    
    
   
    
}
