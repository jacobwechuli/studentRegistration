package com.cruapp.wechuli1.student;

import lombok.Data;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping(path = "api/v1/student")
@RestController
@Data
public class StudentController {

    private final StudentService studentService;
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

}
