package com.tourguide.service.impl;

import com.tourguide.mapper.StudentMapper;
import com.tourguide.model.Student;
import com.tourguide.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServiceInterface {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getSudents() {
        return studentMapper.getSudents();
    }
}
