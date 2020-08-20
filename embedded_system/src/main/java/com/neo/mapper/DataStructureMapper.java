package com.neo.mapper;

import com.neo.model.datastructure;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description Author neo
 * Date 2020/8/19 9:39
 */
@Mapper
public interface DataStructureMapper {


    @Select("select * from datastructure where level = 1")
    List<datastructure> getLevel1();

    @Select("select id from datastructure where name = #{level1name}")
    Integer getIdByName(String level1name);

    @Select("select * from datastructure limit #{offset},20")
    List<datastructure> getLevel2(Integer offset);

    @Select("select * from datastructure where level =2")
    List<datastructure> level2();

    @Select("select * from datastructure where level = 3")
    List<datastructure> level3();
}
