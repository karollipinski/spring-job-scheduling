package net.atos.springjobscheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringJobSchedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJobSchedulingApplication.class, args);
    }

}
