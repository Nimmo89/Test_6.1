package ru.netology.stats;

public class SalesLowAvg {
    public int salLowAvg(long[] sales) {
        AvgSales service = new AvgSales();
        int avgSales = service.avgSales(sales);
        for (long saleMon : sales) {
            if (saleMon < avgSales) {
                System.out.println(saleMon);
            }
        }
        return 0;
    }
}