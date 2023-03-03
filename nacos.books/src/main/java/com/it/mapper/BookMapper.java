package com.it.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.entity.Books;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface BookMapper extends BaseMapper<Books> {
    int getcount(Map<String,Object> param);
}
