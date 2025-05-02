package in.kp.resources;



import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("in.kp.repository")
@ComponentScan(basePackages = {"in.kp"})
public class SpringConfigFile {

	@Bean
	public DataSource myDataSource() {
		
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/spring_data_jpa");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean lceFactoryBean = new LocalContainerEntityManagerFactoryBean();
		
		lceFactoryBean.setDataSource(myDataSource());
		lceFactoryBean.setPackagesToScan("in.kp.entity");
		lceFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		lceFactoryBean.setJpaProperties(hibernateProperties());
		
		
		return lceFactoryBean;
		
	}
	
	public Properties hibernateProperties() {
		
		Properties p = new Properties();
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		
		return p;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager(entityManagerFactory);
		
		return jpaTransactionManager;
	}
	
}
