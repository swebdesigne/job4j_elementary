package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void whenS0ToF10Then55() {
        int rsl = Counter.sum(0,10);
        assertThat(rsl, is(55));
    }

    @Test
    public void whenS3ToF8Then33() {
        int rsl = Counter.sum(0,10);
        assertThat(rsl, is(33));
    }

    @Test
    public void whenS1ToF1Then1() {
        int rsl = Counter.sum(1,1);
        assertThat(rsl, is(1));
    }
}