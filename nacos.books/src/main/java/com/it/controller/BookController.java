package com.it.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.it.entity.Books;
import com.it.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("list")
    public List<Books> list(@RequestParam int id) throws Exception{
        QueryWrapper<Books> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        List<Books> list = bookService.list(queryWrapper);
        return list;

    }
    @GetMapping("findList")
    public List<Books> list() throws Exception{

        return bookService.list();
    }

}
