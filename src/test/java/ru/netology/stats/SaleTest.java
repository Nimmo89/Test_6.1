package ru.netology.stats;
import org.junit.jupiter.api.Test;

public class SaleTest {
    @Test
    public void sale(){
        MinSales service = new MinSales();
        MaxSales service1 = new MaxSales();
        AvgSales service2 = new AvgSales();
        SumSales service3 = new SumSales();
        SalesLowAvg service4 = new SalesLowAvg();
        SalesHighAvg service5 = new SalesHighAvg();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long sumSales = service3.sumSales(sales);
        System.out.println("Сумма всех продаж за год: " + sumSales);

        long avgSales = service2.avgSales(sales);
        System.out.println("Средняя сумма продаж: " + avgSales);

        long maxSales = service1.maxSales(sales);
        System.out.println("Номер месяца в котором был максимум продаж: " + maxSales + "й");

        long minSales = service.minSales(sales);
        System.out.println("Номер месяца в котором был минимум продаж: " + minSales + "й");

        long salLowAvg = service4.salLowAvg(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + salLowAvg);

        long salHighAvg = service5.salHighAvg(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + salHighAvg);
    }
}
