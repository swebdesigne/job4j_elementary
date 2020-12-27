package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whenX0X2Y0Y10Then() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 10;
        double expected = 10.198039027185569;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenX10X2Y0Y10Then() {
        int x1 = 10;
        int x2 = 2;
        int y1 = 0;
        int y2 = 10;
        double expected = 12.806248474865697;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenX20X5Y7Y1Then() {
        int x1 = 20;
        int x2 = 5;
        int y1 = 7;
        int y2 = 1;
        double expected = 16.15549442140351;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenX0X5Y7Y1Then() {
        int x1 = 0;
        int x2 = 5;
        int y1 = 7;
        int y2 = 1;
        double expected = 7.810249675906654;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.001);
    }
}

