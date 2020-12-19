package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void when34125SortThen12345() {
        int[] result = SortSelected.sort(new int[] {3, 4, 1, 2, 5});
        assertThat(result, is(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void when10045SortThen45100() {
        int[] result = SortSelected.sort(new int[] {100, 4, 5});
        assertThat(result, is(new int[] {4, 5, 100}));
    }
}