package br.digitalhouse.testehibernate.repository;

import br.digitalhouse.testehibernate.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
