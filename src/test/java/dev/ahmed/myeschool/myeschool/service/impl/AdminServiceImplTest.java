package dev.ahmed.myeschool.myeschool.service.impl;
/**
 * @author Ahmed Bughra
 * @create 2023-01-29  12:53 PM
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import dev.ahmed.myeschool.myeschool.mapper.AdminMapper;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.LoginForm;
import dev.ahmed.myeschool.myeschool.service.impl.AdminServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class AdminServiceImplTest {
    @Mock
    private AdminMapper adminMapper;

    @InjectMocks
    private AdminServiceImpl adminService;

    private LoginForm loginForm;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        loginForm = new LoginForm();
        loginForm.setUsername("admin");
        loginForm.setPassword("password");
    }

    @Test
    void testLogin() {
        Admin admin = new Admin();
        admin.setName("admin");
        admin.setPassword("5f4dcc3b5aa765d61d8327deb882cf99");

        when(adminMapper.selectOne(any(QueryWrapper.class))).thenReturn(admin);

        Admin result = adminService.login(loginForm);

        assertNotNull(result);
        assertEquals("admin", result.getName());
    }
}
