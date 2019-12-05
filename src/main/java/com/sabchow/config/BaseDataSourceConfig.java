package com.sabchow.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan(basePackages = { BaseDataSourceConfig.MAPPER_PACKAGE }, sqlSessionFactoryRef = "baseSqlSessionTemplate")
public class BaseDataSourceConfig {
	// mapper 的xml存放路径
	protected final static String MAPPER_XML_AREA = "classpath*:com/sabchow/mybatis/dao/*.xml";
	// mapper 的接口存放路径
	protected final static String MAPPER_PACKAGE = "com.sabchow.mybatis.dao";

	@Value("${spring.back.url}")
	private String url;

	@Value("${spring.back.username}")
	private String user;

	@Value("${spring.back.password}")
	private String password;

	@Value("${spring.back.driver-class-name}")
	private String driverClass;

	@Bean(name = "baseDataSource")
	@Primary
	public DataSource setDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUrl(url);
		dataSource.setPassword(password);
		dataSource.setUsername(user);
		return dataSource;
	}

	/**
	 * 注入 事务，在 serviceImpl 的时候使用
	 * 
	 * @return
	 */
	@Bean(name = "baseTransationManager")
	@Primary
	public DataSourceTransactionManager setTransactionManager() {
		// 传入 dataSource
		return new DataSourceTransactionManager(setDataSource());
	}

	/**
	 * 注入 sqlSession
	 * 
	 * @return
	 * @throws Exception
	 */
	@Bean(name = "baseSqlSessionTemplate")
	@Primary
	public SqlSessionFactory setSqlSessionFactory() throws Exception {
		final SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(setDataSource());
		// 设置mapper.xml 扫描路径
		bean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources(BaseDataSourceConfig.MAPPER_XML_AREA));
		return bean.getObject();
	}
}
