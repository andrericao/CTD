package aula15_tema1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Consulta {
    private LocalDate dataConsulta;
    private String especialidade;
    private LocalTime horario;
    private Paciente paciente;

    /*
     * Construtor
     * */

    public Consulta(LocalDate dataConsulta, String especialidade, LocalTime horario, Paciente paciente) {
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.horario = horario;
        this.paciente = paciente;
    }

    /*
     * Getters and Setters
     * */

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /*
     * Métodos da Classe
     * */
    public String avaliarHistorico() {
        if (paciente.isPrimeiraConsulta()) {
            return "Primeira consulta do paciente! Fazer avaliação do Histórico!";
        } else {
            return "Não se trata de 1o consulta!";
        }
    }

}
