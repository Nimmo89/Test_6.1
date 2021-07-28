package ru.netology.stats;

public class SumSales {
    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (int sum = 0; sum < 12; sum++) {
            sumMonth += sales[sum];
        }
        return sumMonth;
    }
}
