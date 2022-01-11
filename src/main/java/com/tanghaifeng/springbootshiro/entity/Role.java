package com.tanghaifeng.springbootshiro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @author TIM
 */
@Data
@AllArgsConstructor
public class Role {
    private String id;

    private String roleName;

    /**
     * 角色对应的权限集合
     */
    private Set<Permissions> permissions;
}
