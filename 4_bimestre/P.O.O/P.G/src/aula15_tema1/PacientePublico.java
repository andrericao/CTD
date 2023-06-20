package aula15_tema1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PacientePublico extends Paciente {
    protected int numeroSus;

    /*
     * Construtor
     * */

    public PacientePublico(LocalDate dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, int numeroSus) {
        super(dataNascimento, nome, sobrenome, primeiraConsulta);
        this.numeroSus = numeroSus;
    }
    /*
     * Getters and Setters
     * */

    public int getNumeroSus() {
        return numeroSus;
    }

    public void setNumeroSus(int numeroSus) {
        this.numeroSus = numeroSus;
    }

    public int compareTo(PacientePublico obj) {
        int comparacao = Integer.compare(this.getNumeroSus(), obj.getNumeroSus());
        String pacienteUm = this.getNome() + " " + this.getSobrenome();
        String pacienteDois = obj.getNome() + " " + obj.getSobrenome();

        if (comparacao < 0) {
            return -1;
        } else if (comparacao > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String compararCarteirinhaSus(PacientePublico obj){
        int resultadoComparacao = compareTo((obj));
        String pacienteUm = this.getNome() + " " + this.getSobrenome();
        String pacienteDois = obj.getNome() + " " + obj.getSobrenome();

        if (resultadoComparacao < 0) {
            return "O paciente" + " " + pacienteUm + " deve ser atendido antes que " + pacienteDois;
        } else if (resultadoComparacao > 0) {
            return "O paciente" + " " + pacienteUm + " deve ser atendido depois que " + pacienteDois;
        } else {
            return pacienteUm + " está marcado para o mesmo horário que o " + pacienteDois + " verificar o possível erro.";
        }



    }


    public static PacientePublico getPacienteByNumeroSus (Map<Integer, PacientePublico> pacienteSus, int targetNumeroSus){
        for (PacientePublico paciente : pacienteSus.values()) {
            if (paciente.getNumeroSus() == targetNumeroSus) {
                return paciente;
            }
        }
        return new PacientePublico(null,null,null,false,0); // Return a default/empty PacientePublico object if not found
    }
}

