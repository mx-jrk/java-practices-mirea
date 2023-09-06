package Practice_3.Task_2;

public class CurrencyConverter {
    private final Currency currency;

    public CurrencyConverter(Currency currency) {
        this.currency = currency;
    }

    public double convert(double cost){
        return cost / currency.getRate();
    }
}