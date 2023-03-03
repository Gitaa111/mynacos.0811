package com.it.controller;

import com.it.Feign.BookFeignClient;
import com.it.entity.Books;
import com.it.entity.Empinfo;
import com.it.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;
    @Autowired
    private BookFeignClient bookFeignClient;

    @GetMapping("one")
    public Empinfo one(@RequestParam int id) throws Exception{
        Empinfo emp = empService.getById(id);
        List<Books> books = bookFeignClient.list(id);
        emp.setBooks(books);
        return emp;

    }

}
