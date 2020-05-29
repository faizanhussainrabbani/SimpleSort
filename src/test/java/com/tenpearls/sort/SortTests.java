package com.tenpearls.sort;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SortTests {
    @Test
    void sortTestIsNull() {
        List<Integer> integers = Sort.sortOddBeforeEven(null);
        assertThat(integers).isNull();
    }

    @Test
    void sortTestIsEmpty() {
        List<Integer> listOfIntegers = new ArrayList<>();

        List<Integer> integers = Sort.sortOddBeforeEven(listOfIntegers);

        assertThat(integers).isNull();
    }

    @Test
    void sortTestIsNotNull() {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.addAll(Arrays.asList(3, 1, 4, 8, 2, 7, 6));

        List<Integer> integers = Sort.sortOddBeforeEven(listOfIntegers);

        assertThat(integers).isNotNull();
    }

    @Test
    void sortTestIsSorted_Test_1() {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.addAll(Arrays.asList(1, 2, 4, 3, 7, 16));

        List<Integer> result = Sort.sortOddBeforeEven(listOfIntegers);

        List<Integer> expectedlistOfIntegers = new ArrayList<>();
        expectedlistOfIntegers.addAll(Arrays.asList(1, 3, 7, 2, 4, 16));

        assertThat(result).isEqualTo(expectedlistOfIntegers);
    }

    @Test
    void sortTestIsSorted_Test_2() {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.addAll(Arrays.asList(3, 1, 4, 8, 2, 7, 6));

        List<Integer> result = Sort.sortOddBeforeEven(listOfIntegers);

        List<Integer> expectedlistOfIntegers = new ArrayList<>();
        expectedlistOfIntegers.addAll(Arrays.asList(3, 1, 7, 4, 8, 2, 6));

        assertThat(result).isEqualTo(expectedlistOfIntegers);
    }


    @Test
    void sortTestIsSorted_Negative() {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.addAll(Arrays.asList(-3, 1, -4, 8, 2, -7, 6));

        List<Integer> result = Sort.sortOddBeforeEven(listOfIntegers);

        List<Integer> expectedlistOfIntegers = new ArrayList<>();
        expectedlistOfIntegers.addAll(Arrays.asList(-3, 1, -7, -4, 8, 2, 6));

        assertThat(result).isEqualTo(expectedlistOfIntegers);
    }

    @Test
    void sortTestIsSorted_Zeros_Included() {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.addAll(Arrays.asList(-3, 1, 0, -4, 8, 2, -7, 6));

        List<Integer> result = Sort.sortOddBeforeEven(listOfIntegers);

        List<Integer> expectedlistOfIntegers = new ArrayList<>();
        expectedlistOfIntegers.addAll(Arrays.asList(-3, 1, -7, 0, -4, 8, 2, 6));

        assertThat(result).isEqualTo(expectedlistOfIntegers);
    }

    @Test
    void sortTestIsSorted_Duplicates() {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.addAll(Arrays.asList(-3, 6, 1, -4, 8, 2, -7, 6, 3, 1));

        List<Integer> result = Sort.sortOddBeforeEven(listOfIntegers);

        List<Integer> expectedlistOfIntegers = new ArrayList<>();
        expectedlistOfIntegers.addAll(Arrays.asList(-3, 1, -7, 3, 1, 6, -4, 8, 2, 6));

        assertThat(result).isEqualTo(expectedlistOfIntegers);
    }

}
