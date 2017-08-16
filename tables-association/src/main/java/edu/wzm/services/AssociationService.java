package edu.wzm.services;

import edu.wzm.mybatis.domain.Classes;
import edu.wzm.tools.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by gatsbynewton on 2017/8/16.
 */
public class AssociationService {

    public void queryOneToOne(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Classes clazz = sqlSession.selectOne("edu.wzm.mybatis.mapping.oneToOne.selectById", 1);

        System.out.println(clazz);
        sqlSession.close();
    }

    public void queryOneToMany(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Classes clazz = sqlSession.selectOne("edu.wzm.mybatis.mapping.oneToMany.selectById", 1);

        System.out.println(clazz);
        sqlSession.close();
    }
}
