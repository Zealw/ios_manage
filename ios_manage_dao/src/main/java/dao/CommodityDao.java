package dao;

import domain.Commodity;
import domain.QueryVO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommodityDao {
    @Select("select * from commodity")
    List<Commodity> showAllCommodities();
    @Select("select *from commodity limit #{startIndex},#{size}")
    List<Commodity> pageAllCommodities(QueryVO queryVO);
    @Select("select count(*) from commodity")
    int findNum(Commodity commodity);
    //一对一、一对多区别于sql语句。=、in
    @Select("select *from commodity where id in (select commodityId from commodity_order where buyerId =#{buyerId} )")
    Commodity findCommodityByCid(int cid);

    @Select("select * from commodity where id=#{id} ")
    Commodity findCommodityById(String id);

}
