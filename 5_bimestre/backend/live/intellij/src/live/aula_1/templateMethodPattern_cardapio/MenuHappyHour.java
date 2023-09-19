package live.aula_1.templateMethodPattern_cardapio;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MenuHappyHour extends Menu{

    public MenuHappyHour(String descricao, float preco) {
        super(descricao, preco);
    }

    @Override
    public float preparar() {
        System.out.println("Preparando menu Happy Hour");
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek(); // Pega o dia da semana
        // return if diaDaSemana.equals(DayOfWeek.TUESDAY) ? getPreco() * 0.8 : getPreco() oi
        if(diaDaSemana.equals(DayOfWeek.MONDAY)){ // se for terça tem a promoção de 20%
            System.out.println("terça é dia de promoção");
            return getPreco() * 0.8f;
        }
        return getPreco();
    }

    public DayOfWeek diaDaSemana(){
        return LocalDate.now().getDayOfWeek();
    }
}
