package br.digitalhouse.dentists.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Dentista implements Serializable {
    private Integer id;
    private String nome;
    private String cro;
    private LocalDate dataNascimento;
    private EspecialidadeEnum especialidade;

    public Dentista(String nome,
                    String cro,
                    LocalDate dataNascimento,
                    EspecialidadeEnum especialidade) {
        this.nome = nome;
        this.cro = cro;
        this.dataNascimento = dataNascimento;
        this.especialidade = especialidade;
    }
    public Date getDataNascimentoComoDate(){
        return Date.valueOf(getDataNascimento());
    }
}
