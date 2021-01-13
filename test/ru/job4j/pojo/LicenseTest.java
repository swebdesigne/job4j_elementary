package ru.job4j.pojo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("Audio");
        License second = new License();
        second.setCode("Audio");
        assertThat(first, is(second));
    }
}