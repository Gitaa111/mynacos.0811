package com.it.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.entity.Empinfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper extends BaseMapper<Empinfo> {

}
