package net.atos.springjobscheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class SchedulingExample {

    //@Scheduled(cron = "* * * ? * *")
    public void printMessage() {
        log.info("Cron example run in {}", LocalDateTime.now());
    }

   // @Scheduled(fixedDelay = 2000 ) //co 2s
    public void printMessageFixedDelay() {
        log.info("FixedDelay example run in {}", LocalDateTime.now());
    }

   // @Scheduled(initialDelay =60000 , fixedDelay = 2000 ) //co 2s startujemy po 1 minucie
    public void printMessageInitialDelayFixedDelay() {
        log.info("InitialDelay and FixedDelay example run in {}", LocalDateTime.now());
    }

    @Scheduled(fixedRate = 4000 ) //co 4s
    public void printMessageFixedRate() {
        log.info("InitialDelay and FixedDelay example run in {}", LocalDateTime.now());
    }

}
