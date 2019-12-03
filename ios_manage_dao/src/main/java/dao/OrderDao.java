package dao;

import domain.Order;
import domain.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {
    @Select("select * from orders")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            //property是实体类中的属性
            @Result(column = "productId",property = "product",one = @One(select = "dao.ProductDao.findById"))
    })
    List<Order> findAll();
    @Select("select * from orders where id = #{id}")
    @Results({
            @Result(id = true,property ="id",column = "id"),
            @Result(property = "member",column = "memberId" ,one = @One(select = "dao.MemberDao.findById")),
            @Result(property = "travellers" ,column = "id" ,many = @Many(select = "dao.TravellerDao.findById")),
            @Result(column = "productId",property = "product",one = @One(select = "dao.ProductDao.findById"))
    })
    Order findById(String id);
    @Insert("insert into orders values (#{id},#{orderNum},#{orderTime},#{peopleCount},#{orderDesc},#{payType},#{orderStatus},#{productId},#{memberId})")
    void addOrder(Order orders);
    @Select("SELECT MAX(orderNum) FROM orders")
    String findMaxOrderNum();
    @Delete("delete from orders where id = #{id} ")
    void delById(String id);
    @Update("update orders set orderStatus ='1' where id = #{id}")
    void updateOrderStatus(String id);

    @Select("select *from orders where orderNum like #{orderNum} ")
    @Results({
            @Result(id = true,property ="id",column = "id"),
            @Result(property = "member",column = "memberId" ,one = @One(select = "dao.MemberDao.findById")),
            @Result(property = "travellers" ,column = "id" ,many = @Many(select = "dao.TravellerDao.findById")),
            @Result(column = "productId",property = "product",one = @One(select = "dao.ProductDao.findById"))
    })
    List<Order> findByOrderNum(String orderNum);

}
