package com.deepcoding.service;

import com.deepcoding.domain.Role;
import com.deepcoding.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<UserInfo> findAll()throws  Exception;


    void save(UserInfo userInfo)throws  Exception;

    UserInfo findById(Integer id)throws  Exception;

    List<Role> findOtherRoles(Integer userid)throws Exception;


    void addRoleToUser(Integer userId, Integer[] roleIds);
}
