package com.example.amigoscodecourse.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student kirill = new Student(
                    "Kirill",
                    "kozhemyakinkirill1@gmail.com",
                    LocalDate.of(2000, JUNE, 19)
            );

            Student sergey = new Student(
                    "Sergey",
                    "kozhemyakinkirill1@gmail.com",
                    LocalDate.of(1989, NOVEMBER, 25)
            );

            repository.saveAll(
                    List.of(kirill, sergey)
            );
        };
    }
}
