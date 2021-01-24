package com.company;

public class CreditPaymentService {
    public double calculate(int creditSum, int month) {
        double percent = 9.99;
        double progress = 0;
        progress = creditSum * (percent / 12 / 100 + (percent / 12 / 100) / (Math.pow((1 + percent / 12 / 100), month) - 1));
        return progress;
    }
}
