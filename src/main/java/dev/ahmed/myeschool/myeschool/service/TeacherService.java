package dev.ahmed.myeschool.myeschool.service;

import com.baomidou.mybatisplus.extension.service.IService;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.LoginForm;
import dev.ahmed.myeschool.myeschool.pojo.Teacher;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:20 PM
 */
public interface TeacherService extends IService<Teacher> {
    Teacher login(LoginForm loginForm);
}
