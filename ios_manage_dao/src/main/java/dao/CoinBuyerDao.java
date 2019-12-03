package dao;

import domain.CoinBuyer;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinBuyerDao {

    @Select("select * from coinBuyer")
    @Results({
            @Result(id = true,property = "iid",column = "iid"),
            @Result(property="user",column = "uid",one = @One(select = "dao.UserDao.findById"))
    })
    List<CoinBuyer> findAll();
    @Insert("insert into coinBuyer values(#{iid},#{uid},#{tradeNum},#{tradePrice})")
    void add(CoinBuyer coinBuyer);
    @Delete("delete from coinBuyer where iid = #{iid}")
    void del(String id);
    @Select("select * from coinBuyer where uid = #{uid}")
    List<CoinBuyer> findByUid(int uid);
}
