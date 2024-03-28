package com.fengluo.learn.demo05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author: fengluo
 * @Date: 2024/3/28 22:46
 */
@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 数据库插入操作，使用 @Transactional 开启事务
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int insert() {
        String sql = "insert into `user`(`login_name`, `nick`, `create_time`, `update_time`)"
                + "values (?, ?, ?, ?)";
        int result = jdbcTemplate.update(sql, "test", "test", new Date(), new Date());
        if (true) {
            throw new RuntimeException("抛出个异常");
        }
        System.out.println(result);
        return result;
    }

}