package com.clond.provider8002.Service.ServiceImpl;

import com.clond.common.Entity.Dept;
import com.clond.provider8002.Mapper.DeptMapper;
import com.clond.provider8002.Service.DeptService;
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

    @Override
    public boolean addDept(Dept detp) {
        return deptMapper.addDetp(detp);
    }
}
