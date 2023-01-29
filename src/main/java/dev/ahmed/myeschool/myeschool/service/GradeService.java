package dev.ahmed.myeschool.myeschool.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.Grade;

import java.util.List;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:20 PM
 */
public interface GradeService extends IService<Grade> {
    IPage<Grade> getGradeByOpr(Page<Grade> page, String gradeName);

    List<Grade> getGrades();
}
