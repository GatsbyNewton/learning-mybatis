package edu.wzm.dao;

import edu.wzm.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by gatsbynewton on 2017/10/28.
 */
public interface OrderDao {
    int insert(@Param("order") Order order);

    Order selectWithNothing(@Param("id") int id);

    Order selectWithAlias(@Param("id") int id);

    Order selectWithMapping(@Param("id") int id);

    Map selectPartialOrder(@Param("id") int id);

}
