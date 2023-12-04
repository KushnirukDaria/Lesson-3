package lesson3;

public class CurrencyConverter {

    private final double commission;
    private final double exchangeRate;

    public CurrencyConverter(double commission, double exchangeRate){
        this.commission =  commission;
        this.exchangeRate = exchangeRate;
    }

    public double calculateTotalAmount(double amountInUSD) {
        double amountInUAH = convertUsdToUah(amountInUSD);
        double commissionAmount = calculateCommission(amountInUAH);
        return amountInUAH - commissionAmount;
    }

    private double convertUsdToUah(double amountInUSD) {
        return amountInUSD * exchangeRate;
    }

    private double calculateCommission(double amountInUAH) {
        return amountInUAH * (commission / 100);
    }

}
