package com.fengluo.learn.demo05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.Driver;

/**
 * @Author: fengluo
 * @Date: 2024/3/28 22:46
 */
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
public class TxDemo01Config {

    /**
     * 生成数据源
     * @return
     * @throws Exception
     */
    @Bean("dataSource")
    public DataSource dataSource() throws Exception {
        Driver driver = new com.mysql.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/backend";
        String username = "root";
        String password = "admin123";
        return new SimpleDriverDataSource(driver, url, username, password);
    }

    /**
     * 生成jdbcTemplate，后面就是用这个类来处理数据库的操作
     * @param dataSource
     * @return
     */
    @Bean("jdbcTemplate")
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    /**
     * 事务管理器
     * @param dataSource
     * @return
     */
    @Bean("transactionManager")
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}