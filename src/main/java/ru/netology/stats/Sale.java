package ru.netology.stats;

public class Sale {
    public static void sale(long[] mountSale) {
        MinSales service = new MinSales();
        MaxSales service1 = new MaxSales();
        AvgSales service2 = new AvgSales();
        SumSales service3 = new SumSales();
        SalesLowAvg service4 = new SalesLowAvg();
        SalesHighAvg service5 = new SalesHighAvg();
    }
}
