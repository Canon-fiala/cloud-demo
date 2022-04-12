package cn.itcast.order.mapper;

import cn.itcast.feign.pojo.User;
import cn.itcast.order.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    @Select("select * from tb_order where id=#{id}")
    Order findById(@Param("id")Long orderid);
}
