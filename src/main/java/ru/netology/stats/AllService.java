package ru.netology.stats;

public class AllService {

    public int avgSales(long[] sales) {
        long avgMonth = 0;
        for (long avg = 0; avg < 12; avg++) {
            avgMonth += sales[(int) avg];
        }
        avgMonth /= 12;
        return (int) avgMonth;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int salHighAvg(long[] sales) {
        long avgMonth = avgSales(sales);
        int countMon = 0;
        for (long saleMon : sales) {
            if (saleMon > avgMonth) {
                countMon++;
            }
        }
        return countMon;
    }

    public long salLowAvg(long[] sales) {
        long avgMonth = avgSales(sales);
        int countMon = 0;
        for (long saleMon : sales) {
           if (saleMon < avgMonth) {
                countMon++;
            }
        }
        return countMon;
    }

    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (int sum = 0; sum < 12; sum++) {
            sumMonth += sales[sum];
        }
        return sumMonth;
    }
}
