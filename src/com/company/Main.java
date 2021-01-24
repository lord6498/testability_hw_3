package com.company;

public class Main {

    public static void main(String[] args) {

        int creditSum = 1_000_000;
        int month = 12;
        CreditPaymentService service = new CreditPaymentService();

        int creditPerMonth = (int) service.calculate(creditSum, month);
        System.out.println(creditPerMonth);

        int creditPerMonth2 = (int) service.calculate(creditSum, month = 24);
        System.out.println(creditPerMonth2);

        int creditPerMonth3 = (int) service.calculate(creditSum, month = 36);
        System.out.println(creditPerMonth3);


    }
}
