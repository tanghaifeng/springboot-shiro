package com.tanghaifeng.springbootshiro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @author TIM
 */
@Data
@AllArgsConstructor
public class User {
    private String id;

    private String name;

    private String password;

    /**
     * 用户对应不同的角色
     */
    private Set<Role> roles;
}
