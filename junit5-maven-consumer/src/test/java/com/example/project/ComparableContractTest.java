package com.example.project;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public interface ComparableContractTest<T extends Comparable<T>> {

    T createSmallerValue();
    
    T createLargerValue();
    

    @Test
    default void returnsPositiveNumberComparedToSmallerValue() {
        T largerValue = createLargerValue();
        T smallerValue = createSmallerValue();
        assertTrue(largerValue.compareTo(smallerValue) > 0);
    }

    @Test
    default void returnsNegativeNumberComparedToSmallerValue() {
        T largerValue = createLargerValue();
        T smallerValue = createSmallerValue();
        assertTrue(smallerValue.compareTo(largerValue) < 0);
    }
}
