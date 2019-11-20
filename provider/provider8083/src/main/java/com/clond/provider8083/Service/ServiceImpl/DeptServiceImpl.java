package com.clond.provider8083.Service.ServiceImpl;

import com.clond.common.Entity.Dept;
import com.clond.provider8083.Mapper.DeptMapper;
import com.clond.provider8083.Service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
