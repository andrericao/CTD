package br.digitalhouse.exercise.orm.service.impl;

import br.digitalhouse.exercise.orm.entity.StudentEntity;
import br.digitalhouse.exercise.orm.repository.IStudentRepository;
import br.digitalhouse.exercise.orm.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService<StudentEntity> {
    private final IStudentRepository studentRepository;

    public StudentServiceImpl (IStudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentEntity> findAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentEntity> findStudentById(Long id){
        return studentRepository.findById(id);
    }

    @Override
    public StudentEntity addStudent(StudentEntity studentEntity){
        if(studentEntity != null){
            return studentRepository.save(studentEntity);
        }
        return new StudentEntity();
    }

    @Override
    public String deleteStudent(Long id){
        if(studentRepository.findById(id).isPresent()){
            studentRepository.deleteById(id);
            return "Estudante deletado";
        }
        return "Estudante não existe!";
    }

    @Override
    public String updateStudent(StudentEntity studentEntity){
        if(studentEntity != null && studentRepository.findById(studentEntity.getId()).isPresent()){
            studentRepository.saveAndFlush(studentEntity);
            return "Dados de estudante atualizados com sucesso!";
        }
        return "Estudante não existe";
    }

}
