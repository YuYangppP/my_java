package com.yu.thymeleaf.mapper;

import com.yu.thymeleaf.domain.Menu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuMapper {

    @Select("select id as id, parent_id as parentId, menu_name as menuName from dept")
    List<Menu> getMenuTestList();
}
