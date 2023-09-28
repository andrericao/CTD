package br.digitalhouse.exercise.orm.controller;

import br.digitalhouse.exercise.orm.entity.StudentEntity;
import br.digitalhouse.exercise.orm.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService){
        this.studentService = studentService;
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = "application/json")
    public List<StudentEntity> fecthAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("student/{id}")
    public Optional<StudentEntity> findStudentById(@PathVariable Long id){
        return studentService.findStudentById(id);
    }

    @PostMapping("/student/add")
    public StudentEntity addStudent(@RequestBody StudentEntity studentEntity){
        return studentService.addStudent(studentEntity);
    }

    @DeleteMapping("student/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/student/update")
    public String updateStudent(@RequestBody StudentEntity studentEntity){
        return studentService.updateStudent(studentEntity);
    }

}
