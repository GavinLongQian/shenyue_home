package com.shenyue.home.dao;

import com.shenyue.home.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface TestMapper {
    List<Test> getAll();
}
