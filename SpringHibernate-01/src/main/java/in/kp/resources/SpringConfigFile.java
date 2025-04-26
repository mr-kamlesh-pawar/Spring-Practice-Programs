package in.kp.resources;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import in.kp.dao.StudentDao;
import in.kp.dao.StudentDaoImpl;

@Configuration
@EnableTransactionManagement
public class SpringConfigFile {

	
	@Bean
	public DriverManagerDataSource dmDataSource() {
		DriverManagerDataSource dmDataSource = new DriverManagerDataSource();
		
		dmDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");;
		dmDataSource.setUrl("jdbc:mysql://localhost:3306/kpawar");
		dmDataSource.setUsername("root");
		dmDataSource.setPassword("root");
		
		return dmDataSource;
		
		}
	
	
	@Bean
	public LocalSessionFactoryBean mySessionFactory() {
		LocalSessionFactoryBean mySessionFactoryBean = new LocalSessionFactoryBean();
		
		mySessionFactoryBean.setDataSource(dmDataSource());
		
		Properties hProperties = new Properties();
		hProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		mySessionFactoryBean.setHibernateProperties(hProperties);
		
		mySessionFactoryBean.setMappingResources("/in/kp/resources/student.hbm.xml");
		// mySessionFactoryBean.setPackagesToScan("in.kp.beans");
			
		
		
		return mySessionFactoryBean;
	}
	
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager hm = new HibernateTransactionManager();
		
		hm.setSessionFactory(mySessionFactory().getObject());
		return hm;
	}
	
	
	@Bean
	public HibernateTemplate myHibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(mySessionFactory().getObject());
		
		return hibernateTemplate;
	}
	
	@Bean
	public StudentDao stdDaoImpBean() {
		StudentDaoImpl stdDaoImpl = new StudentDaoImpl();
		stdDaoImpl.setHibernateTemplate(myHibernateTemplate());
		
		return stdDaoImpl;
	}
}
