package com.amigos.areac.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepostory repostory){
         return  args -> {
             Student benjamini = new Student(

                     "Benjamini",
                     "benny@gmail.com",
                     684573370,
                     LocalDate.of(2000, Month.JANUARY, 5),
                     24
             );
             Student mussa = new Student(

                     "Mussa",
                     "mussa@gmail.com",
                     684573376,
                     LocalDate.of(2000, Month.JANUARY, 5),
                     23
             );

             Student joshua = new Student(

                     "Joshua",
                     "joshua@gmail.com",
                     684573375,
                     LocalDate.of(2000, Month.JANUARY, 5),
                     31
             );

             Student kavula = new Student(
                     "kavula",
                     "kavula@gmail.com",
                     684573311,
                     LocalDate.of(2000, Month.JANUARY, 5),
                     21
             );

             repostory.saveAll(
                     List.of(benjamini ,mussa, joshua,kavula)
             );
         };
    }
}
