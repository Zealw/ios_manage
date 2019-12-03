package dao;

import domain.Admin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {
    @Select("select * from admin")
    List<Admin> findAll();

    @Select("select * from admin where adminName = #{adminName}")
    @Results({
            @Result(id = true,property = "id", column = "id"),
            @Result(property = "roles", column = "id" ,many = @Many(select = "dao.RoleDao.findByUid"))
    })
    Admin findByAdminName(String adminName);

    @Select("select * from admin where adminName like #{adminName}")
    @Results({
            @Result(id = true,property = "id", column = "id"),
            @Result(property = "roles", column = "id" ,many = @Many(select = "dao.RoleDao.findByUid"))
    })
    List<Admin> findByAdminNameS(String adminName);
    
    @Insert("insert into admin values(#{id},#{adminName},#{email},#{password},#{phoneNum},#{status})")
    void addAdmin(Admin adminInfo);
    @Select("select * from admin where id = #{id}")
    @Results({
            @Result(id = true,property = "id", column = "id"),
            @Result(property = "roles", column = "id" ,many = @Many(select = "dao.RoleDao.findByUid"))
    })
    Admin findById(String id);

    @Insert("insert into admin_role values(#{adminId},#{roleId})")
    void addRoleToAdmin(@Param("adminId") String adminId, @Param("roleId") String roleId);

}
