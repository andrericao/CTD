package br.digitalhouse.studentSchoolHQL.repository;

import br.digitalhouse.studentSchoolHQL.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ISchoolRepository extends JpaRepository<SchoolEntity, Long> {

    @Query("SELECT school sh FROM School WHERE sh.management = ?1")
    Optional<SchoolEntity> findSchoolByManagement(String management);
}
