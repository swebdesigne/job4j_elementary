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
}