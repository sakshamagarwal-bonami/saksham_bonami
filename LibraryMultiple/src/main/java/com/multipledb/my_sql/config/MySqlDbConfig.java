package com.multipledb.my_sql.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "firstEntityManagerFactoryBean", basePackages = {
		"com.multipledb.my_sql.repository" }, transactionManagerRef = "firstTransactionManager")
public class MySqlDbConfig {
	@Autowired
	private Environment environment;
	// datasource

	@Bean(name = "firstDataSource")
	@Primary
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(environment.getProperty("aspring.datasource.url"));
		dataSource.setUsername(environment.getProperty("aspring.datasource.username"));
		dataSource.setPassword(environment.getProperty("aspring.datasource.password"));
		//class
		dataSource.setDriverClassName(environment.getProperty("aspring.datasource.driver-class-name"));

		return dataSource;

	}

	// EntitiyManagerFactory
	@Bean(name = "firstEntityManagerFactoryBean")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(dataSource());
		JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		bean.setJpaVendorAdapter(adapter);
		
		Map<String, String> props = new HashMap<>();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");
		bean.setJpaPropertyMap(props);
		bean.setPackagesToScan("com.multipledb.my_sql.entities");
		return bean;
	}

	// platformTransactionManager
	@Primary
	@Bean(name = "firstTransactionManager")
	public PlatformTransactionManager transactionManager() {

		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
		return manager;

	}

}
