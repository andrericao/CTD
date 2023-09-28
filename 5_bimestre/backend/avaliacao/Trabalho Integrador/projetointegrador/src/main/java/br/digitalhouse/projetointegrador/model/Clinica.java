package br.digitalhouse.projetointegrador.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.UUID;

@Getter
@Setter
@Entity
@AllArgsConstructor
public class Clinica {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36)
    private UUID id;

    @Column(length = 100, nullable = false)
    private String nome;
    @CNPJ
    @Column(length = 18, nullable = false)
    private String cnpj;

    @Column(length = 150, nullable = false)
    private String razaoSocial;

    @Column(length = 500, nullable = false)
    private String descricao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "endereco_id",
            referencedColumnName = "id",
            foreignKey =
                    @ForeignKey(name = "fk_endereco_clinica")
    )
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "contato_id",
            referencedColumnName = "id",
            foreignKey =
            @ForeignKey(name = "fk_contato_clinica")
    )
    private Contato contato;
}