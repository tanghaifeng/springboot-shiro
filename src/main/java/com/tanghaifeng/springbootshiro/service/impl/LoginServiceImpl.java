package com.tanghaifeng.springbootshiro.service.impl;

import com.tanghaifeng.springbootshiro.entity.Permissions;
import com.tanghaifeng.springbootshiro.entity.Role;
import com.tanghaifeng.springbootshiro.entity.User;
import com.tanghaifeng.springbootshiro.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author TIM
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public User getUserByName(String name) {
        return getUser(name);
    }

    private User getUser(String name) {

        //权限
        Permissions permissions1 = new Permissions("1", "query");
        Permissions permissions2 = new Permissions("2", "add");

        Set<Permissions> permissionsSet = new HashSet<>();
        permissionsSet.add(permissions1);
        permissionsSet.add(permissions2);

        // 角色
        Role role = new Role("1", "admin", permissionsSet);
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(role);

        User user = new User("1", "wsl", "123456", roleSet);
        Map<String, User> map = new HashMap<>();
        map.put(user.getName(), user);

        Set<Permissions> permissionsSet1 = new HashSet<>();
        permissionsSet1.add(permissions1);
        Role role1 = new Role("2", "user", permissionsSet1);
        Set<Role> roleSet1 = new HashSet<>();
        roleSet1.add(role1);
        User user1 = new User("2", "zhangsan", "123456", roleSet1);
        map.put(user1.getName(), user1);
        return map.get(name);
    }
}
