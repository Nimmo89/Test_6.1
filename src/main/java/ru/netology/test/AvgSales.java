package ru.netology.test;

public class AvgSales {
    public int avgSales(long[] sales) {
        long avgMonth = 0;
        for (int avg = 0; avg < 12; avg++) {
            avgMonth += sales[avg];
        }
        avgMonth /= 12;
        return (int) avgMonth;
    }
}
