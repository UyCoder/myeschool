package dev.ahmed.myeschool.myeschool.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dev.ahmed.myeschool.myeschool.mapper.GradeMapper;
import dev.ahmed.myeschool.myeschool.pojo.Grade;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/**
 * @author Ahmed Bughra
 * @create 2023-01-29  12:58 PM
 */

@ExtendWith(MockitoExtension.class)
class GradeServiceImplTest {
    @Mock
    private GradeMapper gradeMapper;

    @InjectMocks
    private GradeServiceImpl gradeService;

    @Test
    public void testGetGradeByOpr() {
        //given
        Page<Grade> page = new Page<>();
        String gradeName = "grade1";
        List<Grade> grades = new ArrayList<>();
        Grade grade = new Grade();
        grade.setId(1);
        grade.setName("grade1");
        grades.add(grade);
        when(gradeMapper.selectPage(any(), any())).thenReturn(page);

        //when
        IPage<Grade> result = gradeService.getGradeByOpr(page, gradeName);

        //then
        assertNotNull(result);
    }

    @Test
    public void testGetGrades() {
        //given
        List<Grade> grades = new ArrayList<>();
        Grade grade = new Grade();
        grade.setId(1);
        grade.setName("grade1");
        grades.add(grade);
        when(gradeMapper.selectList(any())).thenReturn(grades);

        //when
        List<Grade> result = gradeService.getGrades();

        //then
        assertNotNull(result);
        assertEquals(grades, result);
    }


}