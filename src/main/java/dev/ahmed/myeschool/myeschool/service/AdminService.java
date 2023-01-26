package dev.ahmed.myeschool.myeschool.service;

import com.baomidou.mybatisplus.extension.service.IService;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.LoginForm;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:20 PM
 */
public interface AdminService extends IService<Admin> {
    Admin login(LoginForm loginForm);

    Admin getAdminById(Long userId);
}
