package edu.wzm.services;

import edu.wzm.dao.OrderDao;
import edu.wzm.domain.Order;
import edu.wzm.tools.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by gatsbynewton on 2017/8/15.
 */
public class OrderServices {

    public void add(){
        Order order = new Order();
        order.setOrderNo("NO2334");
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);

        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        System.out.println(mapper.insert(order));
        sqlSession.close();
    }

    public void queryWithNothing(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        System.out.println(mapper.selectWithNothing(1));
        sqlSession.close();
    }

    public void queryWithAlias(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        System.out.println(mapper.selectWithAlias(1));
        sqlSession.close();
    }

    public void queryWithMapping(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        System.out.println(mapper.selectWithMapping(1));
        sqlSession.close();
    }

    public void queryPartialOrder(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        OrderDao mapper = sqlSession.getMapper(OrderDao.class);
        System.out.println(mapper.selectPartialOrder(1));
        sqlSession.close();
    }
}
