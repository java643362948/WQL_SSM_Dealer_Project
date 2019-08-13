package com.deepcoding.dao;

import com.deepcoding.domain.Permission;
import com.deepcoding.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoleDao {


    //根据用户id查询出所有对应的角色
@Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
@Results({
        @Result(id = true, property = "id", column = "id"),
        @Result(property = "roleName", column = "roleName"),
        @Result(property = "roleDesc", column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = List.class,many =@Many(select = "com.deepcoding.dao.PermissionDao.findPermissionByRoleId"))
    })
    public List<Role> findRoleByUserId(String userId)throws Exception;

    @Select("select * from role")
    List<Role> findAll()throws  Exception;


    @Insert("insert into role(roleName,roleDesc) values(#{roleName},#{roleDesc})")
    void save(Role role);
@Select("select *from role where id=#{roleId}")
    Role findById(Integer roleId)throws Exception;
    @Select("select * from permission where id not in (select permissionId from role_permission where roleId=#{roleId})")
    List<Permission> findOtherPermissions(Integer roleId);

    @Insert("insert into role_permission(roleId,permissionId) values(#{roleId},#{permissionId})")
    void addPermissionToRole(@Param("roleId") Integer roleId, @Param("permissionId") Integer permissionId);
}
