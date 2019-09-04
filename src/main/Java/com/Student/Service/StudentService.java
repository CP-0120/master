package com.Student.Service;


import com.Student.Entity.Student;
import com.Student.dao.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(byte[] uid) {
        return studentMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(byte[] uid) {
        return studentMapper.selectByPrimaryKey(uid);
    }

    @Override
    public List<Student> selectByCondition(Student record) {
        return studentMapper.selectByCondition(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }
}
