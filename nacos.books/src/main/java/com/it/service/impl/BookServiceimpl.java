package com.it.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.entity.Books;
import com.it.mapper.BookMapper;
import com.it.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookServiceimpl  extends ServiceImpl<BookMapper, Books> implements BookService {

    @Override
    public int getcount(Map<String, Object> param) {
        return baseMapper.getcount(param);
    }

    @Override
    public Page<Books> getPage(Map<String, Object> param) {
        int index =(int)param.get("index");
        int size =(int)param.get("size");
        int id = (int)param.get("id");

        QueryWrapper<Books> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        Page<Books> page = new Page<>(index,size);
        baseMapper.selectPage(page,queryWrapper);
        return page;
    }
}
