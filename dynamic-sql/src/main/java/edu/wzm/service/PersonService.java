package edu.wzm.service;

import edu.wzm.domain.Person;
import edu.wzm.tool.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gatsbynewton on 2017/8/20.
 */
public class PersonService {

    public void selectWithIf(Person person){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithIf", person);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithTwoLevelIf(Person person){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithTwoLevelIf", person);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithIfWhere(Person person){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithIfWhere", person);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithIfTrim(Person person){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithIfTrim", person);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithChooseWhen(Person person){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithChooseWhen", person);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithTwoLevelChooseWhen(Person person){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithTwoLevelChooseWhen", person);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithForeachArray(int[] pids){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithForeachArray", pids);

        System.out.println(persons);
        sqlSession.close();
    }

    public void selectWithForeachList(List<Integer> pids){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.selectWithForeachList", pids);

        System.out.println(persons);
        sqlSession.close();
    }

    public void updateWithIfSet(Person person){
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        int result = sqlSession.update("edu.wzm.mybatis.mapping.PersonMapper.updateWithIfSet", person);

        System.out.println(result);
        sqlSession.close();
    }

    public void updateWithIfTrim(Person person){
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        int result = sqlSession.update("edu.wzm.mybatis.mapping.PersonMapper.updateWithIfTrim", person);

        System.out.println(result);
        sqlSession.close();
    }

}


