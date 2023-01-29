package dev.ahmed.myeschool.myeschool.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dev.ahmed.myeschool.myeschool.pojo.Grade;
import dev.ahmed.myeschool.myeschool.service.GradeService;
import dev.ahmed.myeschool.myeschool.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:39 PM
 */

@Api(tags = "Grade Controller")
@RestController
@RequestMapping("/sms/gradeController")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @ApiOperation("getGrades")
    @GetMapping("/getGrades")
    public Result getGrades(){
        List<Grade> grades =gradeService.getGrades();
        return Result.ok(grades);
    }

    @ApiOperation("deleteGrade")
    @DeleteMapping("/deleteGrade")
    public Result deleteGrade(
            @ApiParam("List of grade's Id") @RequestBody List<Integer> ids){
        gradeService.removeByIds(ids);
        return Result.ok();
    }

    @ApiOperation("saveOrUpdateGrade")
    @PostMapping("/saveOrUpdateGrade")
    public Result saveOrUpdateGrade(
            @ApiParam("JSON的Grade对象")@RequestBody Grade grade){
        gradeService.saveOrUpdate(grade);
        return Result.ok();
    }

    @ApiOperation("Get Grades with pagination")
    @GetMapping("/getGrades/{pageNo}/{pageSize}")
    public Result getGrades(
            @ApiParam("pageNo") @PathVariable("pageNo") Integer pageNo,
            @ApiParam("pageSize") @PathVariable("pageSize") Integer pageSize,
            @ApiParam("Grade Name") String gradeName){
        Page<Grade> page =new Page<>(pageNo,pageSize);
        IPage<Grade> pageRs=gradeService.getGradeByOpr(page,gradeName);
        return Result.ok(pageRs);
    }
}
