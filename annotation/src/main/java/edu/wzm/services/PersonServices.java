package edu.wzm.services;

import edu.wzm.mybatis.domain.Person;
import edu.wzm.mybatis.mapping.PersonMapper;
import edu.wzm.tools.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by gatsbynewton on 2017/7/16.
 */
public class PersonServices {

    public void add(){
        Person person = new Person("Kim", 30);
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        int result = mapper.add(person);

        System.out.println(result);
        sqlSession.close();
    }

    public void getAll(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        List<Person> person = mapper.getAll();

        System.out.println(person);

        sqlSession.close();
    }

    public void getById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        Person person = mapper.getById(1);

        System.out.println(person);

        sqlSession.close();
    }

    public void update(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);

        Person person = new Person();
        person.setId(6);
        person.setAge(50);
        int result = mapper.update(person);

        System.out.println(result);

        sqlSession.close();
    }

    public void delete(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);

        int result = mapper.deleteById(7);

        System.out.println(result);

        sqlSession.close();
    }
}
