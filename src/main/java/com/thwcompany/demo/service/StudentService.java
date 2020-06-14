package com.thwcompany.demo.service;

import com.thwcompany.demo.pojo.Student;

import java.util.List;

/**
 * @PROJECT_NAME: springbootdemoone
 * @PACKAGE_NAME: com.thwcompany.demo.service
 * @ClassName: StudentService
 * @User: ZARD
 * @Author:tenghw
 * @Description:
 * @CreateDate:2020/6/11 0011 21:54
 * @Day: 星期四
 */
public interface StudentService {
    public List<Student> getAll();
    Student getById(int id);
}
