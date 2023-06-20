package pacientesException;

import java.time.LocalDate;
//import java.util.LocalDate;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    LocalDate dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, LocalDate dataInternacao) {
        LocalDate hoje = LocalDate.now();
        this.nome = nome;
        this.sobrenome = sobrenome;
        dataAlta = null;
        if (dataInternacao.isBefore(hoje)) {
            this.dataInternacao = dataInternacao;
        }
    }

    public void darAlta(LocalDate dataAlta) throws PacienteException {
        if (dataAlta.isAfter(dataInternacao)) {
            System.out.println("Ok");
        } else throw new PacienteException("Data não pode ser marcada!!!");
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    @Override
    public String toString() {
        return "Paciente {" +
                " nome: '" + nome + '\'' +
                ", sobrenome: '" + sobrenome + '\'' +
                ", historiaClinica: '" + historiaClinica + '\'' +
                ", dataInternacao: " + dataInternacao +
                ", dataAlta: " + dataAlta +
                '}';
    }

}
