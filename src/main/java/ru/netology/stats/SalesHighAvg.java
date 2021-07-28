package ru.netology.stats;

public class SalesHighAvg {
    public int salHighAvg(long[] sales) {
        AvgSales service = new AvgSales();
        int avgSales = service.avgSales(sales);
        for (long saleMon : sales) {
            if (saleMon > avgSales) {
                System.out.println(saleMon);
            }
        }
        return 0;
    }
}

