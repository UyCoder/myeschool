package dev.ahmed.myeschool.myeschool.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dev.ahmed.myeschool.myeschool.pojo.Student;
import dev.ahmed.myeschool.myeschool.service.StudentService;
import dev.ahmed.myeschool.myeschool.util.MD5;
import dev.ahmed.myeschool.myeschool.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:39 PM
 */

import java.util.List;
@Api(tags = "Students controller")
@RestController
@RequestMapping("/sms/studentController")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @ApiOperation("delStudentById")
    @DeleteMapping("/delStudentById")
    public Result delStudentById(
            @ApiParam("List of Ids") @RequestBody List<Integer> ids){
        studentService.removeByIds(ids);
        return Result.ok();
    }


    @ApiOperation("addOrUpdateStudent")
    @PostMapping("/addOrUpdateStudent")
    public Result addOrUpdateStudent(@ApiParam("Student json")
                                         @RequestBody Student student ){
        Integer id = student.getId();
        if (null == id || 0 ==id) {
            student.setPassword(MD5.encrypt(student.getPassword()));
        }
        studentService.saveOrUpdate(student);
        return Result.ok();
    }


    @ApiOperation("getStudentByOpr")
    @GetMapping("/getStudentByOpr/{pageNo}/{pageSize}")
    public Result getStudentBuOpr(
            @ApiParam("pageNo") @PathVariable("pageNo") Integer pageNo,
            @ApiParam("pageSize") @PathVariable("pageSize") Integer pageSize,
            @ApiParam("student") Student student){
        Page<Student> pageParam =new Page(pageNo,pageSize);
        IPage<Student> studentPage =studentService.getStudentByOpr(pageParam,student);
        return Result.ok(studentPage);
    }
}