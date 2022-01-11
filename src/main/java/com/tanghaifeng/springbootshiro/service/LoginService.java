package com.tanghaifeng.springbootshiro.service;

import com.tanghaifeng.springbootshiro.entity.User;

/**
 * @author TIM
 */
public interface LoginService {

    User getUserByName(String name);
}
