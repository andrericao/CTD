package br.digitalhouse.studentSchoolHQL.repository;

import br.digitalhouse.studentSchoolHQL.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IStudentRepository extends JpaRepository<StudentEntity, Long> {

    @Query("SELECT student s FROM Student WHERE s.name = ?1")
    Optional<StudentEntity> findStudentByName(String name);
}
