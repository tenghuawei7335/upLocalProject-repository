package com.thwcompany.demo.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @PROJECT_NAME: springbootdemoone
 * @PACKAGE_NAME: com.thwcompany.demo.entity
 * @ClassName: Student
 * @User: ZARD
 * @Author:tenghw
 * @Description:
 * @CreateDate:2020/6/11 0011 21:42
 * @Day: 星期四
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private  String name;
    private  String address;
    private  String classid;
}
