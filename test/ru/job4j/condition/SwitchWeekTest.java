package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SwitchWeekTest {

    @Test
    public void when1ThenMonday() {
        var day = new SwitchWeek();
        String rsl = day.nameOfDay(1);
        assertThat(rsl, is("Понедельник"));
    }

    @Test
    public void when2ThenTuesday() {
        var day = new SwitchWeek();
        String rsl = day.nameOfDay(2);
        assertThat(rsl, is("Вторник"));
    }

    @Test
    public void when3ThenWednesday() {
        var day = new SwitchWeek();
        String rsl = day.nameOfDay(3);
        assertThat(rsl, is("Среда"));
    }

    @Test
    public void when4ThenThursday() {
        var day = new SwitchWeek();
        String rsl = day.nameOfDay(4);
        assertThat(rsl, is("Четверг"));
    }

    @Test
    public void when5ThenFriday() {
        var day = new SwitchWeek();
        String rsl = day.nameOfDay(5);
        assertThat(rsl, is("Пятница"));
    }

    @Test
    public void when6ThenSaturday() {
        var day = new SwitchWeek();
        String rsl = day.nameOfDay(6);
        assertThat(rsl, is("Суббота"));
    }

    @Test
    public void when7ThenSunday() {
        var day = new SwitchWeek();
        String rsl = day.nameOfDay(7);
        assertThat(rsl, is("Воскресенье"));
    }

    @Test
    public void whenNotValidThenError() {
        var day = new SwitchWeek();
        String rsl = day.nameOfDay(8);
        assertThat(rsl, is("Ошибка"));
    }
}