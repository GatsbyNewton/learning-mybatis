package edu.wzm.dao;

import edu.wzm.domain.Classes;
import org.apache.ibatis.annotations.Param;

/**
 * Created by gatsbynewton on 2017/10/28.
 */
public interface TeacherDao {

    Classes selectById(@Param("id") int id);
}
