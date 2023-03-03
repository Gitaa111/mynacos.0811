package com.it.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empinfo {
    private int id;
    private String ename;
    private String edept;
    private double emoner;
    private String ephone;
    @TableField(exist = false)
    private List<Books> books;

}
