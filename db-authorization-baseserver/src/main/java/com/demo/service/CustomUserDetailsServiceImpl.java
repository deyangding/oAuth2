package com.demo.service;

import com.demo.entity.Permission;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.User;

@Service
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // 查询用户信息
        com.demo.entity.User user = userService.getByUserName(userName);
        if (user == null) {
            throw new DisabledException("userName :" + userName + " not found");
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        // 获取用户授权
        List<Permission> permissions = permissionService.getByUserId(user.getId());

        // 声明用户授权
        permissions.forEach(permission -> {
            if (permission != null && permission.getEnName() != null) {
                grantedAuthorities.add(new SimpleGrantedAuthority(permission.getEnName()));
            }
        });

        // 由框架完成认证工作
        return new User(user.getUserName(), user.getPassword(), grantedAuthorities);
    }
}
