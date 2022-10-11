package com.cy.store.mapper;

import com.cy.store.entity.User;
import com.cy.store.service.IUserService;
import com.cy.store.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {
//    idea有检测的功能，接口是不能够直接创建Bean的（动态代理技术来解决）
    @Autowired
    private UserMapper userMapper;
//    单元测试方法：必须@Test,返回值void,空参数，public
    @Test
    public void insert(){
        User user = new User();
        user.setUsername("user03");
        user.setPassword("123456");
        Integer rows = userMapper.insert(user);
        System.out.println("rows=" + rows);
    }
    @Test
    public void findByUsername() {
        String username = "user01";
        User result = userMapper.findByUsername(username);
        System.out.println(result);
    }

    @Test
    public void updatePasswordByUid() {
        Integer uid = 9;
        String password = "123";
        String modifiedUser = "超级管理员";
        Date modifiedTime = new Date();
        Integer rows = userMapper.updatePasswordByUid(uid, password, modifiedUser, modifiedTime);
        System.out.println("rows=" + rows);
    }

    @Test
    public void findByUid() {
        Integer uid = 9;
        User result = userMapper.findByUid(uid);
        System.out.println(result);
    }

    @Test
    public void updateInfoByUid() {
        User user = new User();
        user.setUid(20);
        user.setPhone("17858802222");
        user.setEmail("admin@cy.com");
        user.setGender(1);
        user.setModifiedUser("系统管理员");
        user.setModifiedTime(new Date());
        Integer rows = userMapper.updateInfoByUid(user);
        System.out.println("rows=" + rows);
    }

    @Test
    public void updateAvatarByUid() {
        Integer uid = 10;
        String avatar = "/upload/avatar.png";
        String modifiedUser = "超级管理员";
        Date modifiedTime = new Date();
        Integer rows = userMapper.updateAvatarByUid(uid, avatar, modifiedUser, modifiedTime);
        System.out.println("rows=" + rows);
    }
}
