package br.digitalhouse.studentSchoolHQL.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "School")
public class SchoolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String name;
    private String management;
    @OneToMany(mappedBy = "schoolentity", fetch = FetchType.LAZY)
    private Set<StudentEntity> students = new HashSet<StudentEntity>();
}
