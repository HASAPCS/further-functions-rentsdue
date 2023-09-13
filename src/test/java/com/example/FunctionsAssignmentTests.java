package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FunctionsAssignmentTests {

    FunctionsAssignment functionsAssignment = new FunctionsAssignment();

    @Test
    void testSumMethod() {
        assertEquals(5, functionsAssignment.sum(2, 3));
    }

    @Test
    void testReverseStringMethod() {
        assertEquals("tac", functionsAssignment.reverseString("cat"));
    }

    @Test
    void testGreeting() {
        assertEquals("Hello, John!", functionsAssignment.greeting("John"));
    }

    @Test
    void testFindMaxMethod() {
        assertEquals(5, functionsAssignment.findMax(new int[]{1, 3, 5, 2, 4}));
    }

    @Test
    void testIsPalindromeMethod() {
        assertTrue(functionsAssignment.isPalindrome("madam"));
        assertFalse(functionsAssignment.isPalindrome("hello"));
    }

    @Test
    void testFindLongestWord() {
        assertEquals("jumped", functionsAssignment.findLongestWord("The quick brown fox jumped over the lazy dog"));
    }

    @Test
    void testCalculateAverage() {
        assertEquals(3.0, functionsAssignment.calculateAverage(new int[]{1, 2, 3, 4, 5}), 0.001);
    }

    @Test
    void testIsPrime() {
        assertTrue(functionsAssignment.isPrime(7));
        assertFalse(functionsAssignment.isPrime(4));
    }

    @Test
    void testCalculatePower() {
        assertEquals(8.0, functionsAssignment.calculatePower(2, 3), 0.001);
    }

    @Test
    void testCountCharacterOccurrences() {
        assertEquals(7, functionsAssignment.countCharacterOccurrences("hello hello helllo", 'l'));
    }

    @Test
    void testFindLargestNumber() {
        assertEquals(5, functionsAssignment.findLargestNumber(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testCalculateArraySum() {
        assertEquals(15, functionsAssignment.calculateArraySum(new int[]{1, 2, 3, 4, 5}));
    }
}
