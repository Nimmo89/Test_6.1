package ru.netology.stats;
import org.junit.jupiter.api.Test;
/*import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;*/

public class MinSalesTest {

    @Test
    /*@ParameterizedTest
    @CsvSource({"8,15,13,15,17,20,19,20,7,14,14,18"})*/
        public void minMonSales() {
        MinSales service = new MinSales();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long minMonSales = service.minSales(sales);
        System.out.println("В " + minMonSales + "м месяце был минимум продаж");
    }
}
