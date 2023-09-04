package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Eranga =  new Student(
                    1L,
                    "Eranga",
                    "emohotty@gmail.com",
                    LocalDate.of(1997,5,5));
            Student John = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2000,1,5));

            repository.saveAll(
                    List.of(Eranga,John)
            );


        };
    }
}
