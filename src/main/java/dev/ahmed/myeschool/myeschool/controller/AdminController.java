package dev.ahmed.myeschool.myeschool.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.service.AdminService;
import dev.ahmed.myeschool.myeschool.util.MD5;
import dev.ahmed.myeschool.myeschool.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:39 PM
 */

@Api(tags = "Admin Controller")
@RestController
@RequestMapping("/sms/adminController")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @ApiOperation("getAllAdmin")
    @GetMapping("/getAllAdmin/{pageNo}/{pageSize}")
    public Result getAllAdmin(
            @ApiParam("pageNo") @PathVariable("pageNo") Integer pageNo,
            @ApiParam("pageSize") @PathVariable("pageSize") Integer pageSize,
            @ApiParam("Admin name") String adminName) {
        Page<Admin> pageParam = new Page<Admin>(pageNo, pageSize);
        IPage<Admin> iPage = adminService.getAdminsByOpr(pageParam, adminName);
        return Result.ok(iPage);
    }

    @ApiOperation("saveOrUpdateAdmin")
    @PostMapping("/saveOrUpdateAdmin")
    public Result saveOrUpdateAdmin(
            @ApiParam("Admin Json") @RequestBody Admin admin) {
        Integer id = admin.getId();
        if (id == null || 0 == id) {
            admin.setPassword(MD5.encrypt(admin.getPassword()));
        }
        adminService.saveOrUpdate(admin);
        return Result.ok();
    }


    @ApiOperation("deleteAdmin")
    @DeleteMapping("/deleteAdmin")
    public Result deleteAdmin(
            @ApiParam("Admin Ids")
            @RequestBody List<Integer> ids) {
        adminService.removeByIds(ids);
        return Result.ok();
    }
}
