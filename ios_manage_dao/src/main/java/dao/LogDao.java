package dao;

import domain.Log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogDao {
    @Insert("insert into log values(#{id},#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void add(Log log);
    @Select("select * from log ")
    List<Log> findAll();
}
