package ru.job4j.array;

import org.junit.Test;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas2Then1() {
        int el = 2;
        int[] data = {1, 2, 5, 10};
        int array = FindLoop.indexOf(data, el);
        assertThat(array, is(1));
    }

    @Test
    public void whenArrayHasNot7ThenMinus1() {
        int el = 7;
        int[] data = {1, 2, 5, 10};
        int array = FindLoop.indexOf(data, el);
        assertThat(array, is(-1));
    }

    @Test
    public void whenArrayHas5Then0() {
        int el = 5;
        int[] data = {5, 2, 5, 10};
        int array = FindLoop.indexOf(data, el);
        assertThat(array, is(0));
    }

    @Test
    public void whenArrayHasNot3ThenMinus1() {
        int el = 3;
        int[] data = {0, 4, 1, 5};
        int array = FindLoop.indexOf(data, el);
        assertThat(array, is(-1));
    }
}