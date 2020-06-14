package com.thwcompany.demo.dao;

import com.thwcompany.demo.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @PROJECT_NAME: springbootdemoone
 * @PACKAGE_NAME: com.thwcompany.demo.mapper
 * @ClassName: IStudent
 * @User: ZARD
 * @Author:tenghw
 * @Description:
 * @CreateDate:2020/6/11 0011 21:43
 * @Day: 星期四
 */

public interface StudentMapper {

    List<Student> getAll();
    Student getById(@Param("id") int id);
}
