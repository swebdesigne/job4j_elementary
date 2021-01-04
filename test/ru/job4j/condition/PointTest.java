package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whenX0X2Y0Y10Then() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 10);
        double expected = 8.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenX10X2Y0Y10Then() {
        Point a = new Point(10, 0);
        Point b = new Point(2, 10);
        double expected = 12.806248474865697;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenX20X5Y7Y1Then() {
        Point a = new Point(20, 7);
        Point b = new Point(5, 1);
        double expected = 16.15549442140351;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenX0X5Y7Y1Then() {
        Point a = new Point(0, 7);
        Point b = new Point(5, 1);
        double expected = 7.810249675906654;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenX0X0Y2Y10Z10Z0Then() {
        Point a = new Point(0, 2,  10);
        Point b = new Point(0, 10, 0);
        double expected = 12.806248474865697;
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.001);
    }
}

