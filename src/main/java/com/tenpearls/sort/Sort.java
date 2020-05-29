package com.tenpearls.sort;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static List<Integer> sortOddBeforeEven(List<Integer> listOfIntegers) {
        if (listOfIntegers == null || listOfIntegers.isEmpty()) {
            return null;
        }
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer anInteger :
                listOfIntegers) {
            if (anInteger % 2 == 0) {
                evenNumbers.add(anInteger);
            } else {
                oddNumbers.add(anInteger);
            }
        }
        oddNumbers.addAll(evenNumbers);
        return oddNumbers;
    }
}
