package dao;

import domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from user where id in( select userId from user_user where userId = #{userId})")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "permissions", column = "id", many = @Many(select = "dao.PermissionDao.findByRid"))
    })
    List<User> findByUid(String userId);
    @Select("select *from user")
    List<User> findAll();
    @Insert("insert into user values(#{id},#{username},#{userDesc})")
    void add(User user);
    @Update("update user set username = #{username},userDesc = #{userDesc} where id = #{id}")
    void update(User user);

    @Select("select * from user where id = #{id}")
    @Results({
            @Result(id = true,property = "id", column = "id"),
            @Result(property = "permissions", column = "id", many = @Many(select = "dao.PermissionDao.findByRid"))
    })
    User findById(String id);

    @Select("SELECT * FROM user WHERE id  NOT IN (SELECT userId FROM user_user WHERE userId = #{uid})")
    List<User> findOthersById(String uid);
    @Results({
            @Result(id = true,property = "id", column = "id"),
            @Result(property = "permissions", column = "id", many = @Many(select = "dao.PermissionDao.findByRid"))
    })
    @Select("select *from user where username like #{username} ")
    List<User> findByUserName(String username);



}
