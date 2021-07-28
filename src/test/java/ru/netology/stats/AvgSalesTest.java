package ru.netology.stats;
import org.junit.jupiter.api.Test;

public class AvgSalesTest {
    @Test
    public void avgMonSales() {
        AvgSales service = new AvgSales();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long avgMonSales = service.avgSales(sales);
        System.out.println(avgMonSales + " Средняя сумма продаж в месяц");
    }
}
