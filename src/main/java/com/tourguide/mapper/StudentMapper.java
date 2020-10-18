package com.tourguide.mapper;

import com.tourguide.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> getSudents();
}
