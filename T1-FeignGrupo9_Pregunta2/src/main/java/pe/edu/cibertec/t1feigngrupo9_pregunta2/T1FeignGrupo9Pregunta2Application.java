package pe.edu.cibertec.t1feigngrupo9_pregunta2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {
        org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration.class,
        org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration.class
})
@EnableFeignClients
public class T1FeignGrupo9Pregunta2Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo9Pregunta2Application.class, args);
    }
}