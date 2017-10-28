package edu.wzm.dao;

import edu.wzm.domain.Classes;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by gatsbynewton on 2017/10/28.
 */
public interface ClassesDao {
    Classes selectById(@Param("id") int id);

    Map selectPartialById(@Param("id") int id);

    List<Classes> selectAll();

    List<Map> selectPartialAll();
}
