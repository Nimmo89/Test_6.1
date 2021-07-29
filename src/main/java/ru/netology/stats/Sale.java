package ru.netology.stats;

public class Sale {
    public static void sale() {
        AllService service = new AllService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long sumSales = service.sumSales(sales);
        System.out.println("Сумма всех продаж за год: " + sumSales);

        long avgSales = service.avgSales(sales);
        System.out.println("Средняя сумма продаж: " + avgSales);

        long maxSales = service.maxSales(sales);
        System.out.println("Номер месяца в котором был максимум продаж: " + maxSales + "й");

        long minSales = service.minSales(sales);
        System.out.println("Номер месяца в котором был минимум продаж: " + minSales + "й");

        long salLowAvg = service.salLowAvg(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + salLowAvg);

        long salHighAvg = service.salHighAvg(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + salHighAvg);
    }
}
