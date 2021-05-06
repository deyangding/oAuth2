package com.demo.service;

import com.demo.entity.Permission;
import java.util.List;

public interface PermissionService {
    List<Permission> getByUserId(String userId);
}
