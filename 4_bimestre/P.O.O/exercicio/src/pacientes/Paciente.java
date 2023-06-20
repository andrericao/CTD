package pacientes;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    LocalDate dataInternacao;
    LocalDate dataAlta;


    public Paciente(LocalDate dataInternacao) {
        this.dataInternacao = dataInternacao;
    }


    Paciente(String nome,
             String sobrenome,
             String historiaClinica,
             LocalDate dataInternacao)
            throws  PacientesException {

        LocalDate hoje = LocalDate.now();
        this.nome = nome;
        this.sobrenome = sobrenome;
        dataAlta = null;
        if (dataInternacao.isAfter(hoje)){
            this.dataInternacao = dataInternacao;
        System.out.println("Paciente internado");
    } else {
        throw new PacientesException("Data de internção esta maior que a data de hoje.");
        }
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta) throws PacientesException {
        if (dataAlta.isBefore(dataInternacao)) {
            System.out.println("Paciente teve alta");
        } else {
            throw new PacientesException("Data da alta está incorreta");
        }
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", historiaClinica='" + historiaClinica + '\'' +
                ", dataInternacao=" + dataInternacao +
                ", dataAlta=" + dataAlta +
                '}';
    }


}
