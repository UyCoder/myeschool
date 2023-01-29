package dev.ahmed.myeschool.myeschool.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dev.ahmed.myeschool.myeschool.pojo.Clazz;
import dev.ahmed.myeschool.myeschool.service.ClazzService;
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

@Api(tags = "Class Controller")
@RestController
@RequestMapping("/sms/clazzController")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;


    @ApiOperation("Get Class")
    @GetMapping("/getClazzs")
    public Result getClazzs() {
        List<Clazz> clazzes = clazzService.getClazzs();
        return Result.ok(clazzes);
    }


    @ApiOperation("Delete Class")
    @DeleteMapping("/deleteClazz")
    public Result deleteClazz(
            @ApiParam("Ids of delete class") @RequestBody List<Integer> ids) {
        clazzService.removeByIds(ids);
        return Result.ok();
    }


    @ApiOperation("saveOrUpdateClazz")
    @PostMapping("/saveOrUpdateClazz")
    public Result saveOrUpdateClazz(
            @ApiParam("Class info") @RequestBody Clazz clazz) {
        clazzService.saveOrUpdate(clazz);
        return Result.ok();
    }


    @ApiOperation("get Clazzs with pagination")
    @GetMapping("/getClazzsByOpr/{pageNo}/{pageSize}")
    public Result getClazzByOpr(
            @ApiParam("pageNo") @PathVariable("pageNo") Integer pageNo,
            @ApiParam("pageSize") @PathVariable("pageSize") Integer pageSize,
            @ApiParam("Class info") Clazz clazz) {
        Page<Clazz> page = new Page<>(pageNo, pageSize);
        IPage<Clazz> iPage = clazzService.getClazzsByOpr(page, clazz);
        return Result.ok(iPage);
    }
}