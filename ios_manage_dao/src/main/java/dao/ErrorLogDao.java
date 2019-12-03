package dao;

import domain.ErrorLog;
import domain.Log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErrorLogDao {
    @Insert("insert into errorLog values(#{id},#{visitTime},#{username},#{ip},#{url},#{code},#{method},#{message})")
    void add(ErrorLog errorLog);
    @Select("select * from errorLog ")
    List<Log> findAll();
}
