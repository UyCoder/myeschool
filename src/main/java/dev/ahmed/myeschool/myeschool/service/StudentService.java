package dev.ahmed.myeschool.myeschool.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.LoginForm;
import dev.ahmed.myeschool.myeschool.pojo.Student;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:20 PM
 */
public interface StudentService extends IService<Student> {
    Student login(LoginForm loginForm);

    Student getStudentById(Long userId);

    IPage<Student> getStudentByOpr(Page<Student> pageParam, Student student);
}
