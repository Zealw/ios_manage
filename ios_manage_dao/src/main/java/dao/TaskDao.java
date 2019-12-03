package dao;

import domain.Task;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskDao {
    @Select("select *from task where uid= #{uid}")
    List<Task> findTaskByUid(int uid);
    @Insert("insert into task(taskLevel,taskProduct,containDay,uid) values(1,0.4,30,#{uid})")
    void certify(int uid);
}
