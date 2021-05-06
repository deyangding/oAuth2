package com.demo.service;

import com.demo.dao.PermissionDao;
import com.demo.entity.Permission;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public List<Permission> getByUserId(String userId) {
        return permissionDao.findByUserId(userId);
    }

}