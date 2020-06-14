package com.thwcompany.demo.service.impl;

import com.thwcompany.demo.dao.StudentMapper;
import com.thwcompany.demo.pojo.Student;
import com.thwcompany.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @PROJECT_NAME: springbootdemoone
 * @PACKAGE_NAME: com.thwcompany.demo.service.impl
 * @ClassName: StudentServiceImp
 * @User: ZARD
 * @Author:tenghw
 * @Description:
 * @CreateDate:2020/6/11 0011 21:55
 * @Day: 星期四
 */
@Service
@Transactional
public class StudentServiceImp implements StudentService {
@Autowired
public StudentMapper studentMapper;
    @Override
    public List<Student> getAll() {

        return studentMapper.getAll();
    }

    @Override
    public Student getById(int id) {
        return studentMapper.getById(id);
    }
}
