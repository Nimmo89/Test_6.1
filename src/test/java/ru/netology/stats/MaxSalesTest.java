package ru.netology.stats;
import org.junit.jupiter.api.Test;
/*import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;*/

public class MaxSalesTest {

    @Test
    /*@ParameterizedTest
    @CsvSource({"8,15,13,15,17,20,19,20,7,14,14,18"})*/
    public void maxMonSales() {
        MaxSales service = new MaxSales();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long maxMonSales = service.maxSales(sales);
        System.out.println(maxMonSales + "й месяц");

    }
}
