package team.lyqwc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启事务注解


public class LyqwcProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyqwcProjectApplication.class, args);
    }

}
