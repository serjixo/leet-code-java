package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {
    private static final int[] NO_DUPLICATES =  {1, 2, 3, 4, 5};
    private static final int[] HAS_DUPLICATES =  {5, 2, 3, 4, 5};
    @Test
    void ShouldReturnFalseWithNoDuplicatesInInput() {

        boolean containsDuplicates = ContainsDuplicates.containsDuplicates(NO_DUPLICATES);

        assertEquals(false, containsDuplicates);
    }
    @Test
    void ShouldReturnTrueWithDuplicatesInInput() {

        boolean containsDuplicates = ContainsDuplicates.containsDuplicates(HAS_DUPLICATES);

        assertEquals(true, containsDuplicates);
    }

}