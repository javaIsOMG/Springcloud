package com.clond.provider8002.Mapper;

import com.clond.common.Entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
//    Detp findById(Integer deptNo);
    List<Dept> findAll();
    boolean addDetp(Dept detp);
}
