package edu.wzm.dao;

import edu.wzm.domain.Person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by gatsbynewton on 2017/7/15.
 */
public interface PersonMapper {

    @Insert("insert into person(name, age) values(#{name}, #{age})")
    public int add(Person person);

    @Select("select * " +
            "from person " +
            "where id = #{id}")
    public Person getById(int id);

    @Select("select * from person")
    public List<Person> getAll();

    @Update("update person set age = #{age} where id = #{id}")
    public int update(Person person);

    @Delete("delete from person where id = #{id}")
    public int deleteById(int id);

}
