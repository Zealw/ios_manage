package dao;

import domain.Coin;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinDao {
    @Select("select * from coin where uid = #{uid}")
    Coin findCoinByUid(int uid);
    @Update("update coin set coinNum = #{coinNum} where uid = #{uid}")
    void updateCoinNum(Coin coin);

}
