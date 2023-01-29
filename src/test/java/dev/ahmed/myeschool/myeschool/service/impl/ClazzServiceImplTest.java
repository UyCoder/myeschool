package dev.ahmed.myeschool.myeschool.service.impl;

/**
 * @author Ahmed Bughra
 * @create 2023-01-29  12:56 PM
 */
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dev.ahmed.myeschool.myeschool.pojo.Clazz;
import dev.ahmed.myeschool.myeschool.service.ClazzService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClazzServiceImplTest {

    @Autowired
    private ClazzService clazzService;

    @Test
    public void getClazzsByOprTest() {
        Clazz clazz = new Clazz();
        clazz.setGradeName("Grade 1");
        clazz.setName("Class A");
        Page<Clazz> page = new Page<>(1, 10);
        IPage<Clazz> clazzPage = clazzService.getClazzsByOpr(page, clazz);
        Assert.assertNotNull(clazzPage);
    }

    @Test
    public void getClazzsTest() {
        List<Clazz> clazzList = clazzService.getClazzs();
        Assert.assertNotNull(clazzList);
        Assert.assertTrue(clazzList.size() > 0);
    }
}
