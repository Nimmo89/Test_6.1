package ru.netology.stats;
import org.junit.jupiter.api.Test;

public class SalesLowAvgTest {
    @Test
    public void LowAvg() {
        SalesLowAvg service = new SalesLowAvg();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long LowAvg = service.salLowAvg(sales);
        System.out.println(LowAvg);
    }
}
