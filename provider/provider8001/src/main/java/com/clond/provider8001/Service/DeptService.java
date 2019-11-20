package com.clond.provider8001.Service;

import com.clond.common.Entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();
    boolean addDept(Dept detp);
}
