package com.deepcoding.service.impl;


import com.deepcoding.dao.RoleDao;
import com.deepcoding.domain.Permission;
import com.deepcoding.domain.Role;
import com.deepcoding.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public void addPermissionToRole(Integer roleId, Integer[] permissionIds) throws Exception {
        for (Integer permissionId : permissionIds) {
            roleDao.addPermissionToRole(roleId,permissionId);
        }
    }

    @Override
    public Role findById(Integer roleId) throws Exception {
        return roleDao.findById(roleId);
    }


    @Override
    public List<Permission> findOtherPermissions(Integer roleId)throws Exception {
        return roleDao.findOtherPermissions(roleId);
    }

    @Override
    public List<Role> findAll() throws  Exception{
        return roleDao.findAll();
    }

    @Override
    public void save(Role role)throws  Exception {
        roleDao.save(role);
    }
}
