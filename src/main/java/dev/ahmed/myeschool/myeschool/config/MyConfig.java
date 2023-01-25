package dev.ahmed.myeschool.myeschool.config;

/**
 * @author Ahmed Bughra
 * @create 2023-01-23  9:08 PM
 */
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("dev.ahmed.myeschool.myeschool.mapper")
public class MyConfig {

    /**
     * paging plugin
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();

        // paginationInterceptor.setLimit(Your maximum limit on a single page, the default is 500, less than 0 such as -1 is unlimited);
        return paginationInterceptor;
    }


}
