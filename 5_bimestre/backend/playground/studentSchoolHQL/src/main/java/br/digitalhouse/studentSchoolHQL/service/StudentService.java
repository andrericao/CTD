package br.digitalhouse.studentSchoolHQL.service;

import br.digitalhouse.studentSchoolHQL.entity.StudentEntity;
import br.digitalhouse.studentSchoolHQL.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> fetchAllStudents(){
        return studentRepository.findAll();
    }

    public StudentEntity fetchStudentByName(String name){
        return studentRepository.findStudentByName(name).get();
    }
}
