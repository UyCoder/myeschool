package dev.ahmed.myeschool.myeschool.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dev.ahmed.myeschool.myeschool.mapper.ClazzMapper;
import dev.ahmed.myeschool.myeschool.mapper.StudentMapper;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.Clazz;
import dev.ahmed.myeschool.myeschool.pojo.LoginForm;
import dev.ahmed.myeschool.myeschool.pojo.Student;
import dev.ahmed.myeschool.myeschool.service.ClazzService;
import dev.ahmed.myeschool.myeschool.service.StudentService;
import dev.ahmed.myeschool.myeschool.util.MD5;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:21 PM
 */
@Service("studentServiceImpl")
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Override
    public Student login(LoginForm loginForm) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", loginForm.getUsername());
        queryWrapper.eq("password", MD5.encrypt(loginForm.getPassword()));

        Student student = baseMapper.selectOne(queryWrapper);
        return student;
    }

    @Override
    public Student getStudentById(Long userId) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<Student>();
        queryWrapper.eq("id", userId);
        return baseMapper.selectOne(queryWrapper);
    }

    @Override
    public IPage<Student> getStudentByOpr(Page<Student> pageParam, Student student) {
        QueryWrapper<Student> studentQueryWrapper =new QueryWrapper<>();
        if(!StringUtils.isEmpty(student.getName())){
            studentQueryWrapper.like("name",student.getName());
        }
        if(!StringUtils.isEmpty(student.getClazzName())){
            studentQueryWrapper.like("clazz_name",student.getClazzName());
        }
        studentQueryWrapper.orderByDesc("id");
        Page<Student> studentPage = baseMapper.selectPage(pageParam, studentQueryWrapper);
        return studentPage;
    }
}
