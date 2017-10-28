package edu.wzm.services;

import edu.wzm.domain.Order;
import edu.wzm.tools.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by gatsbynewton on 2017/8/15.
 */
public class OrderServices {

    public void add(){
        Order order = new Order("QEAVRWE", 98.6f);
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);

        int result = sqlSession.insert("edu.wzm.mybatis.mapping.orderMapper.insert", order);
        System.out.println(result);
        sqlSession.close();
    }

    public void queryWithNothing(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Order order = sqlSession.selectOne("edu.wzm.mybatis.mapping.orderMapper.selectWithNothing", 1);
        System.out.println(order);
        sqlSession.close();
    }

    public void queryWithAlias(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Order order = sqlSession.selectOne("edu.wzm.mybatis.mapping.orderMapper.selectWithAlias", 1);
        System.out.println(order);
        sqlSession.close();
    }

    public void queryWithMapping(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Order order = sqlSession.selectOne("edu.wzm.mybatis.mapping.orderMapper.selectWithMapping", 1);
        System.out.println(order);
        sqlSession.close();
    }
}
