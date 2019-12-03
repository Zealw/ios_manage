package dao;

import domain.CoinSeller;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinSellerDao {
    @Select("select * from coinSeller")
    List<CoinSeller> findAll();
    @Insert("insert into coinSeller values #{id},#{uid},#{tradeNum},#{tradePrice}")
    void add(CoinSeller coinSeller);
}
