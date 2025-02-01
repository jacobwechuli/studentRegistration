package com.cruapp.wechuli1.student;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;


//@AllArgsConstructor
@Setter
@NoArgsConstructor
@Entity
@Table
public class Student {
    @Getter
    @Id
    @SequenceGenerator(
            name = "Student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private Long id;
    @Getter
    private String name;
    @Getter
    private String email;
    @Getter
    private LocalDate dob;

    @Transient
    private Integer age;

    public Student(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;

    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

}
