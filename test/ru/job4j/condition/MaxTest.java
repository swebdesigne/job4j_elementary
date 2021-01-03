package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax8To7Then8() {
        int result = Max.max(8, 7);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax3To9Then9() {
        int result = Max.max(4, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax9() {
        int result = Max.max(1, 2, 7, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax3() {
        int result = Max.max(1, 3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5() {
        int result = Max.max(5, 3, 2);
        assertThat(result, is(5));
    }
}