package ru.netology.test;
import org.junit.jupiter.api.Test;

public class SalesHighAvgTest {
    @Test
    public void LowAvg() {
        SalesHighAvg service = new SalesHighAvg();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long LowAvg = service.salHighAvg(sales);
        System.out.println(LowAvg);
    }
}
