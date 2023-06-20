package dhLancarExcecoes;

public class Data2 {
    private int day;
    private int month;
    private int year;

    public Data2(int d, int m, int y)  throws DataException{
        if (d < 1 || d > 31)
            throw new DataException("O dia do mês deve ser inteiro positivo e estar entre 1 e 31");
            day = d;
        if ( m < 1 || m > 12)
            throw new DataException("O mês deve ser inteiro positivo e estar entre 1 e 12");
            month = m;
        if ( y < 1)
            throw new DataException("O ano deve ser inteiro positivo");
            year = y;
    }

    @Override
    public String toString(){
        return "dia: " + day + " ,mês: " + month + " ,ano: " + year;
    }
}
