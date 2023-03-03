package com.it.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.it.entity.Books;

import java.util.Map;

public interface BookService extends IService<Books> {

    int getcount(Map<String,Object> param);

    Page<Books> getPage(Map<String,Object> param);

}
