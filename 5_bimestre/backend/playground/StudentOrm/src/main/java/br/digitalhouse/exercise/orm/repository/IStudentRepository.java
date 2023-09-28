package br.digitalhouse.exercise.orm.repository;

import br.digitalhouse.exercise.orm.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<StudentEntity, Long> {//TIPO DO ID
}
