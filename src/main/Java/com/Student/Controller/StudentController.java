package com.Student.Controller;


import com.Student.Entity.Student;
import com.Student.Service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/api/student")
public class StudentController {

    @Resource
    private IStudentService service;

    @GetMapping()
    public String Get() {
        List<Student> students = service.selectByCondition(new Student());
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(students);
        return jsonResult;
    }
    @RequestMapping("/Test")
    public String toTest(){
        String id = "12345676";
        try{
            Student student = new Student();
            student.setUid(111);
            student.setAge(1);
            student.setName("张三");
            student.setClassid(11);
            service.insert(student);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        return id;
    }


}
