package ru.netology.stats;

public class StatsService {
    public long sumMonth(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long mediumMonth(long[] sales) {
        return sumMonth(sales) / sales.length;
    }

    public int maxMonth(long[] sales) {
        int max = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int minMonth(long[] sales) {
        int min = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int lessThanMedium(long[] sales) {
        long medium = mediumMonth(sales);
        int count_less = 0;

        for (long month : sales) {
            if (month < medium) {
                count_less += 1;
            }
        }
        return count_less;
    }

    public int moreThanMedium(long[] sales) {
        long medium = mediumMonth(sales);
        int count_less = 0;

        for (long month : sales) {
            if (month > medium) {
                count_less += 1;
            }
        }
        return count_less;
    }

}