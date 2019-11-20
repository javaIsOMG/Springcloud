package com.clond.provider8002.Service;

import com.clond.common.Entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();
    boolean addDept(Dept detp);
}
