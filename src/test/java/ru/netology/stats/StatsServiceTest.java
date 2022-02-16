package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSumMonth() {
        StatsService stat = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long result = stat.sumMonth(sales);
        assertEquals(result, expected);
    }

    @Test
    void shouldMediumMonth() {
        StatsService stat = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long result = stat.mediumMonth(sales);
        assertEquals(result, expected);
    }

    @Test
    void shouldMaxMonth() {
        StatsService stat = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        long result = stat.maxMonth(sales);
        assertEquals(result, expected);
    }

    @Test
    void shouldMinMonth() {
        StatsService stat = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        long result = stat.minMonth(sales);
        assertEquals(result, expected);
    }

    @Test
    void shouldLessThanMedium() {
        StatsService stat = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long result = stat.lessThanMedium(sales);
        assertEquals(result, expected);
    }

    @Test
    void shouldMoreThanMedium() {
        StatsService stat = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long result = stat.moreThanMedium(sales);
        assertEquals(result, expected);
    }
}