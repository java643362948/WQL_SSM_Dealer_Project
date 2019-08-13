package com.deepcoding.service;


import com.deepcoding.domain.Permission;
import com.deepcoding.domain.Role;

import java.util.List;

public interface RoleService  {
   public List<Role> findAll()throws  Exception;

    void save(Role role)throws  Exception;


    Role findById(Integer roleId)throws  Exception;


    List<Permission> findOtherPermissions(Integer roleId)throws Exception;

    void addPermissionToRole(Integer roleId, Integer[] permissionIds)throws Exception;
}
