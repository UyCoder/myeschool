package dev.ahmed.myeschool.myeschool.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Ahmed Bughra
 * @create 2023-01-23  9:55 PM
 */
@Data
@TableName("tb_grade")
public class Grade {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String introducation;
    private String manager;
    private String email;
    private String telephone;

}
