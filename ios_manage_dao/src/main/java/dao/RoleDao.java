package dao;

import domain.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao {
    @Select("select * from role where id in( select roleId from admin_role where adminId = #{adminId})")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "permissions", column = "id", many = @Many(select = "dao.PermissionDao.findByRid"))
    })
    List<Role> findByUid(String adminId);
    @Select("select *from role")
    List<Role> findAll();
    @Insert("insert into role values(#{id},#{roleName},#{roleDesc})")
    void add(Role role);
    @Update("update role set roleName = #{roleName},roleDesc = #{roleDesc} where id = #{id}")
    void update(Role role);

    @Select("select * from role where id = #{id}")
    @Results({
            @Result(id = true,property = "id", column = "id"),
            @Result(property = "permissions", column = "id", many = @Many(select = "dao.PermissionDao.findByRid"))
    })
    Role findById(String id);

    @Select("SELECT * FROM role WHERE id  NOT IN (SELECT roleId FROM admin_role WHERE adminId = #{uid})")
    List<Role> findOthersById(String uid);
    @Results({
            @Result(id = true,property = "id", column = "id"),
            @Result(property = "permissions", column = "id", many = @Many(select = "dao.PermissionDao.findByRid"))
    })
    @Select("select *from role where roleName like #{roleName} ")
    List<Role> findByRoleName(String roleName);

}
