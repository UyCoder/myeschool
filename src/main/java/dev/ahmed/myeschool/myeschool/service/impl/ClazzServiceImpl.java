package dev.ahmed.myeschool.myeschool.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dev.ahmed.myeschool.myeschool.mapper.ClazzMapper;
import dev.ahmed.myeschool.myeschool.pojo.Clazz;
import dev.ahmed.myeschool.myeschool.service.ClazzService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:21 PM
 */
@Service("clazzServiceImpl")
@Transactional
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper,Clazz> implements ClazzService {
}
