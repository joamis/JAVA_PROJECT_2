package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Calendar.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            List<Student> listOfStudents = new ArrayList<>();
            Student maria = new Student(
                    1L,
                    "Maria",
                    "maria@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, FEBRUARY, 5)
            );

            listOfStudents.add(maria);
            listOfStudents.add(alex);
            repository.saveAll(listOfStudents);
        };
    }
}
