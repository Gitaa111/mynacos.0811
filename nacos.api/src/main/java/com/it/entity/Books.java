package com.it.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private int id;
    @TableField(value = "bookName")
    private String  bookName;
    @TableField(value = "bookAuthor")
    private String bookAuthor;
    private int eid;
    @TableField(value = "pageCount")
    private int pageCount;
    @TableField(value = "price")
    private double price;

}
