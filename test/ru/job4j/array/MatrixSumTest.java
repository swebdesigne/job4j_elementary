package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MatrixSumTest {
    @Test
    public void whenSingle() {
        assertThat(
                MatrixSum.sum(new int[][] {{10}}),
                is(10)
        );
    }

    @Test
    public void whenTwo() {
        assertThat(
                MatrixSum.sum(new int[][] {{1, 2}, {1, 2}}),
                is(6)
        );
    }

    @Test
    public void whenThree() {
        assertThat(
                MatrixSum.sum(new int[][] {{1, 2, 1}, {1, 2, 0}}),
                is(7)
        );
    }
}