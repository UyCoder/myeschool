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
import org.springframework.stereotype.Controller;
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

    @ApiOperation("Delete Grade")
    @DeleteMapping("/deleteGrade")
    public Result deleteGrade(
            @ApiParam("List of Json of grade to delete")
            @RequestBody List<Integer> ids) {
        gradeService.removeByIds(ids);
        return Result.ok();
    }

    @ApiOperation("Save Or Update Grade")
    @PostMapping("/saveOrUpdateGrade")
    public Result saveOrUpdateGrade(@ApiParam("Save newly added Grade or update Grade")
                                    @RequestBody Grade grade) {
        gradeService.saveOrUpdate(grade);
        return Result.ok();
    }


    @ApiOperation("Get Grade by name")
    @GetMapping("/getGrades/{pageNo}/{pageSize}")
    public Result getGrades(@ApiParam("Page Number") @PathVariable("pageNo") Integer pageNo,
                            @ApiParam("Page Size") @PathVariable("pageSize") Integer pageSize,
                            @ApiParam("Grade Name") String gradeName) {

        Page<Grade> page = new Page<>(pageNo, pageSize);
        IPage<Grade> pageRs = gradeService.getGradeByOpr(page, gradeName);
        return Result.ok(pageRs);

    }
}
