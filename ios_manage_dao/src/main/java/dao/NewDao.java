package dao;

import domain.New;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewDao {
     @Select("select *from news")
    List<New> findAllNews();
     @Select("insert into news(title) values(#{title})")
     void add(New news);
}
