package com.demo.dao;

import com.demo.entity.Role;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleDao {

    Role findByRoleId(String roleId);
}
