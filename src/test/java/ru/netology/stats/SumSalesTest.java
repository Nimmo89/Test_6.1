package ru.netology.stats;
import org.junit.jupiter.api.Test;

public class SumSalesTest {
    @Test
    public void sumYearSales() {
        SumSales service = new SumSales();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long sumYearSales = service.sumSales(sales);
        System.out.println(sumYearSales + " Сумма продаж за год");
    }
}
