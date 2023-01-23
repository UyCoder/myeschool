package dev.ahmed.myeschool.myeschool.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ahmed Bughra
 * @create 2023-01-23  9:53 PM
 */
@Data
@TableName("tb_clazz")
public class Clazz {
        //班级信息
        @TableId(value = "id",type = IdType.AUTO)
        private Integer id;
        private String name;
        private String number;
        private String introducation;
        private String headmaster;
        private String telephone;
        private String email;
        private String gradeName;
}
