package dev.ahmed.myeschool.myeschool.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dev.ahmed.myeschool.myeschool.mapper.AdminMapper;
import dev.ahmed.myeschool.myeschool.mapper.GradeMapper;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.Grade;
import dev.ahmed.myeschool.myeschool.service.AdminService;
import dev.ahmed.myeschool.myeschool.service.GradeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:21 PM
 */

@Service
@Transactional
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {


    @Override
    public IPage<Grade> getGradeByOpr(Page<Grade> pageParam, String gradeName) {

        QueryWrapper<Grade> queryWrapper=new QueryWrapper();

        if (!StringUtils.isEmpty(gradeName)) {
            queryWrapper.like("name",gradeName);
        }
        queryWrapper.orderByDesc("id");
        Page<Grade> page = baseMapper.selectPage(pageParam, queryWrapper);
        return page;
    }

    @Override
    public List<Grade> getGrades() {
        return  baseMapper.selectList(null);
    }
}