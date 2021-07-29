package ru.netology.test;

public class SalesLowAvg {
    public long salLowAvg(long[] sales) {
        AvgSales service = new AvgSales();
        int avgSales = service.avgSales(sales);
        int countMon = 0;
        for (long saleMon : sales) {
            if (saleMon < avgSales) {
                countMon++;
            }
        }
        return countMon;
    }
}