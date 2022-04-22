package ro.iteahome.java.advanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ro.iteahome.java.advanced.config.DataConfig;
import ro.iteahome.java.advanced.dao.UserDAO;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
@EnableWebMvc
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
