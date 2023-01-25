package dev.ahmed.myeschool.myeschool.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dev.ahmed.myeschool.myeschool.mapper.StudentMapper;
import dev.ahmed.myeschool.myeschool.mapper.TeacherMapper;
import dev.ahmed.myeschool.myeschool.pojo.LoginForm;
import dev.ahmed.myeschool.myeschool.pojo.Student;
import dev.ahmed.myeschool.myeschool.pojo.Teacher;
import dev.ahmed.myeschool.myeschool.service.StudentService;
import dev.ahmed.myeschool.myeschool.service.TeacherService;
import dev.ahmed.myeschool.myeschool.util.MD5;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:21 PM
 */
@Service("teacherServiceImpl")
@Transactional
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
    @Override
    public Teacher login(LoginForm loginForm) {
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", loginForm.getUsername());
        queryWrapper.eq("password", MD5.encrypt(loginForm.getPassword()));

        Teacher teacher = baseMapper.selectOne(queryWrapper);
        return teacher;
    }
}
