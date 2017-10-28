package edu.wzm.services;

import edu.wzm.domain.Person;
import edu.wzm.tools.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gatsbynewton on 2017/8/20.
 */
public class PersonServices {

    public void selectWithIf(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Person entity = new Person();
        entity.setPname("Jimmy");
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithIf", entity);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithIfWhere(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Person entity = new Person();
        entity.setPname("Jimmy");
        entity.setPage(30);
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithIfWhere", entity);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithIfTrim(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Person entity = new Person();
//        entity.setPname("Steve");
        entity.setPage(25);
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithIfTrim", entity);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithChooseWhen(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Person entity = new Person();
//        entity.setPname("Jimmy");
        entity.setPage(30);
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithChooseWhen", entity);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithForeachArray(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        int[] pids = {1, 3};
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithForeachArray", pids);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithForeachList(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Integer> pids = new ArrayList<>();
        pids.add(2);
        pids.add(3);
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithForeachList", pids);

        System.out.println(persons);
        sqlSession.close();
    }

    public void updateWithIfSet(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        Person entity = new Person();
        entity.setPid(2);
        entity.setPname("Bill");
        int result = sqlSession.update("edu.wzm.mybatis.mapping.PersonMapper.updateWithIfSet", entity);

        System.out.println(result);
        sqlSession.close();
    }

    public void updateWithIfTrim(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        Person entity = new Person();
        entity.setPid(2);
        entity.setPname("Newton");
        int result = sqlSession.update("edu.wzm.mybatis.mapping.PersonMapper.updateWithIfTrim", entity);

        System.out.println(result);
        sqlSession.close();
    }

}


