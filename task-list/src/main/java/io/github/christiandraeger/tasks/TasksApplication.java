package io.github.christiandraeger.tasks;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.christiandraeger.tasks.domain.Task;
import io.github.christiandraeger.tasks.service.TaskService;

@SpringBootApplication
public class TasksApplication {

    @Bean
    CommandLineRunner runner (TaskService taskService) {
        return args -> {
            taskService.save(new Task(1L, "some completed task", LocalDate.now(), true));
            taskService.save(new Task(2L, "this task is not done yet", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(3L, "some other task", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
            taskService.save(new Task(4L, "yet another task", LocalDate.now().plus(5, ChronoUnit.DAYS), false));
        };
    }

    public static void main(final String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }
}
