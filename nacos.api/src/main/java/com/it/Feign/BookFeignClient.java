package com.it.Feign;

import com.it.entity.Books;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "books-server")
public interface BookFeignClient {
    @GetMapping("book/list")
    public List<Books> list(@RequestParam int id) throws Exception;

}
