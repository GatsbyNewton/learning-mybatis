package edu.wzm.tools;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by gatsbynewton on 2017/7/16.
 */
public class MyBatisUtils {

    public static SqlSessionFactory getSqlSessionFactory(){
        InputStream is = MyBatisUtils.class.getClassLoader().getResourceAsStream(Const.MYBATIS_CONFIG_FILE);
        return new SqlSessionFactoryBuilder().build(is);
    }

    public static SqlSession getSqlSession(boolean autoCommit){
        return getSqlSessionFactory().openSession(autoCommit);
    }

    public static SqlSession getSqlSession(){
        return getSqlSessionFactory().openSession();
    }
}
