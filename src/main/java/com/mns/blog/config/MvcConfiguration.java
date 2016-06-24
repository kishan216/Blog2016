package com.mns.blog.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.mns.blog")
@EnableWebMvc
@EnableTransactionManagement
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/views/");
	    resolver.setSuffix(".jsp");
	    return resolver;
	}
	
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/projectmns");
	    dataSource.setUsername("root");
	    dataSource.setPassword("root");
	    dataSource.setMaxActive(10);
	    dataSource.setInitialSize(1);
	 
	    return dataSource;
	}
	
	private Properties getHibernateProperties() {
	    Properties properties = new Properties();
	    
	    properties.put("hibernate.show_sql", "true");
	    properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	    properties.put("hibernate.hbm2ddl.auto", "none");
	    
	    return properties;
	}
	
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	 
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    
	    sessionBuilder.scanPackages("com.mns.blog");
	    sessionBuilder.addProperties(getHibernateProperties());
	    
	    return sessionBuilder.buildSessionFactory();
	}
	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		
	    HibernateTransactionManager transactionManager =
	    		new HibernateTransactionManager(sessionFactory);
	 
	    return transactionManager;
	}
	
	@Autowired
	@Bean(name = "hibernateTemplate")
	public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory) {
		
		HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionFactory);
		
		return hibernateTemplate;
	}

}
