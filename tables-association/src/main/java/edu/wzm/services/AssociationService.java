package edu.wzm.services;

import edu.wzm.dao.ClassesDao;
import edu.wzm.dao.TeacherDao;
import edu.wzm.domain.Classes;
import edu.wzm.tools.MyBatisUtils;
import org.apache.ibatis.javassist.compiler.ast.Symbol;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by gatsbynewton on 2017/8/16.
 */
public class AssociationService {

    public void queryOneToMany(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ClassesDao mapper = sqlSession.getMapper(ClassesDao.class);

        System.out.println(mapper.selectById(1));
        sqlSession.close();
    }

    public void queryOneToManyAll(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ClassesDao mapper = sqlSession.getMapper(ClassesDao.class);

        System.out.println(mapper.selectAll());
        sqlSession.close();
    }

    public void queryOneToManyPartial(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ClassesDao mapper = sqlSession.getMapper(ClassesDao.class);

        System.out.println(mapper.selectPartialById(1));
        sqlSession.close();
    }

    public void queryOneToManyPartialAll(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        ClassesDao mapper = sqlSession.getMapper(ClassesDao.class);

        System.out.println(mapper.selectPartialAll());
        sqlSession.close();
    }

    public void queryOneToOneById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherDao mapper = sqlSession.getMapper(TeacherDao.class);

        System.out.println(mapper.selectById(2));
        sqlSession.close();
    }
}
