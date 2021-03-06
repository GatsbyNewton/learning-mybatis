package edu.wzm.services;

import edu.wzm.domain.Person;
import edu.wzm.tools.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by gatsbynewton on 2017/7/16.
 */
public class PersonServices {

    public void add(){
        Person person = new Person("Alice", 30);
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        /**
         * 映射sql的标识字符串。
         * edu.wzm.mybatis.mapping.PersonMapper是PersonMapper.xml中mapper标签的namespace属性的值，
         * insert是insert标签的id属性值，通过update标签的id属性值就可以找到要执行的SQL。
         */
        int result = sqlSession.insert("edu.wzm.mybatis.mapping.PersonMapper.insert", person);

        System.out.println(result);
        sqlSession.close();
    }

    public void getAll(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        List<Person> persons = sqlSession.selectList("edu.wzm.mybatis.mapping.PersonMapper.getAll");

        System.out.println(persons);

        sqlSession.close();
    }

    public void getById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Person person = sqlSession.selectOne("edu.wzm.mybatis.mapping.PersonMapper.getById", 1);

        System.out.println(person);

        sqlSession.close();
    }

    public void update(){
        Person person = new Person();
        person.setId(7);
        person.setAge(27);

        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        int result = sqlSession.update("edu.wzm.mybatis.mapping.PersonMapper.update", person);

        System.out.println(result);

        sqlSession.close();
    }

    public void delete(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession(true);
        int result = sqlSession.update("edu.wzm.mybatis.mapping.PersonMapper.delete", 6);
        System.out.println(result);

        sqlSession.close();
    }
}
