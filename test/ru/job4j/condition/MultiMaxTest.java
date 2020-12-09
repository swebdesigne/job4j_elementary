package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(3,4,2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax(){
        int result = MultiMax.max(7, 6,2);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax(){
        int result = MultiMax.max(7, 6, 11);
        assertThat(result, is(11));
    }

    @Test
    public void whenAllEqual(){
        int result = MultiMax.max(6,6,6);
        assertThat(result, is(6));
    }
}