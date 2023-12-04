package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double commission = 1;
        double exchangeRate = 36.55;

        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter(commission, exchangeRate);

        while (true) {
            System.out.println("Введіть кількість доларів для конвертації:");
            String input = scanner.nextLine();

            try {
                double amountInUSD = Double.parseDouble(input);
                double totalAmount = converter.calculateTotalAmount(amountInUSD);
                double roundedDecimalTotalAmount = Math.round(totalAmount * 100.0) / 100.0;
                System.out.println("Сума до виплати (у гривнях): " + roundedDecimalTotalAmount);
            } catch (NumberFormatException e) {
                System.out.println("Будь ласка, введіть коректне число.");
            }
        }
    }
}
