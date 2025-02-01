package com.cruapp.wechuli1;

import com.cruapp.wechuli1.student.Student;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

@Data
public class Wechuli1Application {

	public static void main(String[] args) {

		SpringApplication.run(Wechuli1Application.class, args);
	}

	}




