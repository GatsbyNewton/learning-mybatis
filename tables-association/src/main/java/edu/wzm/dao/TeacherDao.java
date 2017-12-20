package edu.wzm.dao;

import edu.wzm.domain.Classes;
import edu.wzm.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gatsbynewton on 2017/10/28.
 */
public interface TeacherDao {

    Classes selectById(@Param("id") int id);

    List<Student> selectStudent();
}
