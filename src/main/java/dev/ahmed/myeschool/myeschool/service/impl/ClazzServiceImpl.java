package dev.ahmed.myeschool.myeschool.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dev.ahmed.myeschool.myeschool.mapper.ClazzMapper;
import dev.ahmed.myeschool.myeschool.pojo.Clazz;
import dev.ahmed.myeschool.myeschool.service.ClazzService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;

import java.util.List;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:21 PM
 */

@Service
@Transactional
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz> implements ClazzService {


    @Override
    public IPage<Clazz> getClazzsByOpr(Page<Clazz> pageParam, Clazz clazz) {
        QueryWrapper<Clazz> queryWrapper=new QueryWrapper<>();
        String gradeName = clazz.getGradeName();
        if (!StringUtils.isEmpty(gradeName)) {
            queryWrapper.like("grade_name",gradeName);
        }

        String name = clazz.getName();
        if (!StringUtils.isEmpty(name)) {
            queryWrapper.like("name",name);
        }
        queryWrapper.orderByDesc("id");
        Page<Clazz> clazzPage = baseMapper.selectPage(pageParam, queryWrapper);

        return clazzPage;
    }

    @Override
    public List<Clazz> getClazzs() {
        return baseMapper.selectList(null);
    }
}
