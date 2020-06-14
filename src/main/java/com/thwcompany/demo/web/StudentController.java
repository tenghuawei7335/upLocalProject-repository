package com.thwcompany.demo.web;

import com.thwcompany.demo.pojo.Student;
import com.thwcompany.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

/**
 * @PROJECT_NAME: springbootdemoone
 * @PACKAGE_NAME: com.thwcompany.demo.controller
 * @ClassName: StudentController
 * @User: ZARD
 * @Author:tenghw
 * @Description:
 * @CreateDate:2020/6/11 0011 20:03
 * @Day: 星期四
 */
@Slf4j
@Controller
@PropertySource(value = {"classpath:test.properties"},encoding = "UTF-8",ignoreResourceNotFound = false)
public class StudentController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Value("${project.name}")//赋值成功application.yml里面值
    private String name;
    @Value("${project.author}")//赋值成功test.properties里面值
    private String author;

    @Autowired
    private StudentService studentService;

    @RequestMapping("/test")
    @ResponseBody
    public List<Student> test() throws SQLException {
        log.warn(String.valueOf(jdbcTemplate.getClass()));
        return jdbcTemplate.query("select * from student",
                                   new BeanPropertyRowMapper<Student>(Student.class));
    }
    @GetMapping(value = "/test1")
    @ResponseBody
    public String test1() throws SQLException {
    return "name==="+name+",author==="+author;
    }

    @GetMapping(value = "/getAll")
    @ResponseBody
    public List<Student> getAll() throws SQLException {
        return  studentService.getAll();
    }

    @GetMapping(value = "/getById")
    @ResponseBody
    public Student getById(@RequestParam("id") int id) throws SQLException {
        return  studentService.getById(id);
    }
}
