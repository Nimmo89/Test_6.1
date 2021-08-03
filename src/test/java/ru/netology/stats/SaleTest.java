package ru.netology.stats;
import org.junit.jupiter.api.Test;

public class SaleTest {
    @Test
    public void sale(){
        AllService service = new AllService();
        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int sumSales = service.sumSales(sales);
        System.out.println("Сумма всех продаж за год: " + sumSales);

        int avgSales = service.avgSales(sales);
        System.out.println("Средняя сумма продаж: " + avgSales);

        int maxSales = service.maxSales(sales);
        System.out.println("Номер месяца в котором был максимум продаж: " + maxSales + "й");

        int minSales = service.minSales(sales);
        System.out.println("Номер месяца в котором был минимум продаж: " + minSales + "й");

        int salLowAvg = service.salLowAvg(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + salLowAvg);

        int salHighAvg = service.salHighAvg(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + salHighAvg);
    }
}
