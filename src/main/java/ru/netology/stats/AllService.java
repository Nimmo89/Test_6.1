package ru.netology.stats;

public class AllService {

    public int avgSales(int[] sales) {  //вычисление среднего значения массива
        return sumSales(sales) / sales.length; //деление суммы массива на количество значений
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int salHighAvg(int[] sales) {
        int avgMonth = avgSales(sales);
        int countMon = 0;
        for (int saleMon : sales) {
            if (saleMon > avgMonth) {
                countMon++;
            }
        }
        return countMon;
    }

    public int salLowAvg(int[] sales) {
        int avgMonth = avgSales(sales);
        int countMon = 0;
        for (int saleMon : sales) {
           if (saleMon < avgMonth) {
                countMon++;
            }
        }
        return countMon;
    }

    public int sumSales(int[] sales) {
        int sumMonth = 0;
        for (int sum = 0; sum < 12; sum++) {
            sumMonth += sales[sum];
        }
        return sumMonth;
    }
}
