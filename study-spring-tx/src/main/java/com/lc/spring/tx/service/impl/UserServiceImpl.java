package com.lc.spring.tx.service.impl;

import com.lc.spring.tx.dao.UserDao;
import com.lc.spring.tx.entity.User;
import com.lc.spring.tx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserInfo(long userId) {
        return userDao.getUserInfo(userId);
    }

    @Override
    public int addUser(User user) {
        int result;
        try {
            result = userDao.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            result = 0;
        }
        return result;
    }
}
