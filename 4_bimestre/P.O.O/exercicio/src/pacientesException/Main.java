package pacientesException;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Paciente paciente = new Paciente("Juan","Perez","12345",
                LocalDate.of(2021, Month.MAY,10));

       System.out.println(paciente.dataInternacao);

        try {
            paciente.darAlta(LocalDate.of(2021,Month.MAY,11));
        } catch (PacienteException e) {
            System.err.println(e);
        }
    }
}
