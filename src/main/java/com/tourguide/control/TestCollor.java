package com.tourguide.control;

import com.alibaba.fastjson.JSONObject;
import com.tourguide.model.Student;
import com.tourguide.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestCollor {

    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/test/cbw")
    public String testMethod(){
        List<Student> resultDatas = studentService.getSudents();
        return JSONObject.toJSONString(resultDatas);
    }
}
