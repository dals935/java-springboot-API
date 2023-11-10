package spring.java_api.student;

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
//            Student john = new Student(
//                    "John",
//                    "legend@mail.com",
//                    LocalDate.of(2000, APRIL, 5)
//
//            );
//
//            Student weak = new Student(
//                    "Weak",
//                    "weak@mail.com",
//                    LocalDate.of(1945, MARCH, 5)
//            );
//
//            repository.saveAll(
//                    List.of(john, weak)
//            );
        };
    }
}
