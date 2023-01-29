package dev.ahmed.myeschool.myeschool.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dev.ahmed.myeschool.myeschool.pojo.Teacher;
import dev.ahmed.myeschool.myeschool.service.TeacherService;
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

@Api(tags = "Teacher Controller")
@RestController
@RequestMapping("/sms/teacherController")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation("getTeacher")
    @GetMapping("/getTeachers/{pageNo}/{pageSize}")
    public Result getTeachers(
            @ApiParam("pageNo") @PathVariable("pageNo") Integer pageNo ,
            @ApiParam("pageSize") @PathVariable("pageSize") Integer pageSize ,
            @ApiParam("teacher") Teacher teacher){
        Page<Teacher> paraParam =new Page<>(pageNo,pageSize);
        IPage<Teacher> page = teacherService.getTeachersByOpr(paraParam,teacher);
        return Result.ok(page);
    }


    @ApiOperation("saveOrUpdateTeacher")
    @PostMapping("/saveOrUpdateTeacher")
    public Result saveOrUpdateTeacher(
            @ApiParam("JOSN of Teacher") @RequestBody Teacher teacher){
        if (teacher.getId() == null || teacher.getId() ==0){
            teacher.setPassword(MD5.encrypt(teacher.getPassword()));
        }
        teacherService.saveOrUpdate(teacher);
        return  Result.ok();
    }

    @ApiOperation("deleteTeacher")
    @DeleteMapping("/deleteTeacher")
    public Result deleteTeacher(
            @ApiParam("List of Ids")
            @RequestBody List<Integer> ids){
        teacherService.removeByIds(ids);
        return Result.ok();
    }
}

