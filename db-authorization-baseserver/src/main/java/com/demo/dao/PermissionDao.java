package com.demo.dao;

import com.demo.entity.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionDao {

    List<Permission> findByUserId(String userId);
}