package com.it.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.Mapper.EmpMapper;
import com.it.entity.Empinfo;
import com.it.service.EmpService;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceimpl  extends ServiceImpl<EmpMapper, Empinfo> implements EmpService {

}
