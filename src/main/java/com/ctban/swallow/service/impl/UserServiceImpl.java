package com.ctban.swallow.service.impl;

import com.ctban.swallow.dto.UserDTO;
import com.ctban.swallow.mapper.UserDao;
import com.ctban.swallow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author GuoJie 2018/7/2 15:31
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    private UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDTO findUserInfoId(Long id) {

        return userDao.findUserInfoId(id);

    }
}
