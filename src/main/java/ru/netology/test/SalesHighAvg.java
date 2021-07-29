package ru.netology.test;

public class SalesHighAvg {
    public int salHighAvg(long[] sales) {
        AvgSales service = new AvgSales();
        int avgSales = service.avgSales(sales);
        int countMon = 0;
        for (long saleMon : sales) {
            if (saleMon > avgSales) {
                countMon++;
            }
        }
        return countMon;
    }
}

