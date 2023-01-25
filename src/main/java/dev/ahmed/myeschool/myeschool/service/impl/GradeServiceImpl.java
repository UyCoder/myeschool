package dev.ahmed.myeschool.myeschool.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dev.ahmed.myeschool.myeschool.mapper.AdminMapper;
import dev.ahmed.myeschool.myeschool.mapper.GradeMapper;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.Grade;
import dev.ahmed.myeschool.myeschool.service.AdminService;
import dev.ahmed.myeschool.myeschool.service.GradeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:21 PM
 */
@Service("gradeServiceImpl")
@Transactional
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
}
