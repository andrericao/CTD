package aula15_tema1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static aula15_tema1.PacientePublico.getPacienteByNumeroSus;

public class Main {

    public static void main(String[] args, Object Integer) {
        Map<Integer, PacientePublico> pacienteSus = new HashMap<>();

        PacientePublico pacientePublico1 = new PacientePublico(LocalDate.of(1987, 5, 19), "Alex", "Santos", true, 3029323);
        PacientePublico pacientePublico2 = new PacientePublico(LocalDate.of(1977, 9, 1), "Aurora", "Dias", false, 30348790);
        PacienteParticular pacienteParticular1 = new PacienteParticular(LocalDate.of(1968, 10, 2), "Maria", "Sousa", true, "6534567-8");
        PacienteParticular pacienteParticular2 = new PacienteParticular(LocalDate.of(1999, 1, 23), "Maria", "Sousa", false, "6538309-4");

        pacienteSus.put(pacientePublico1.getNumeroSus(), pacientePublico1);
        pacienteSus.put(pacientePublico2.getNumeroSus(), pacientePublico2);
        getPacienteByNumeroSus(pacienteSus,30348790);
    }
}