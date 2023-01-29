package dev.ahmed.myeschool.myeschool.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.Clazz;

import java.util.List;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:20 PM
 */
public interface ClazzService extends IService<Clazz> {

    IPage<Clazz> getClazzsByOpr(Page<Clazz> page, Clazz clazz);

    List<Clazz> getClazzs();
}
