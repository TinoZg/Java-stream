package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StreamPracticeTest {

    @Test
    void fitlerAndCollectOfEmptyListShouldBeEmpty() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(List.of(), streamPractice.fitlerAndCollect(List.of()));
    }

    @Test
    void fitlerAndCollectOfOddAndEvenShouldOnlyBeEven() {
        StreamPractice streamPractice = new StreamPractice();
        List<Integer> list = List.of(1, 2, 3, 4);
        assertEquals(List.of(2, 4), streamPractice.fitlerAndCollect(list));
    }

    @Test
    void fitlerAndCollectOfOddShouldBeEmpty() {
        StreamPractice streamPractice = new StreamPractice();
        List<Integer> list = List.of(1, 3, 5);
        assertEquals(List.of(), streamPractice.fitlerAndCollect(list));
    }

    @Test
    void fitlerAndCollectOfEvenShouldBeSame() {
        StreamPractice streamPractice = new StreamPractice();
        List<Integer> list = List.of(2, 4, 6);
        assertEquals(list, streamPractice.fitlerAndCollect(list));
    }

    @Test
    void mapAndCollectOfEmptyListShouldBeEmpty() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(List.of(), streamPractice.fitlerAndCollect(List.of()));
    }

    @Test
    void mapAndCollectOfAllUpperCaseShouldStayTheSame() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(List.of("ABC", "DEF", "UJI"), streamPractice.mapAndCollect(List.of("ABC", "DEF", "UJI")));
    }

    @Test
    void mapAndCollectOfAll() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(List.of("ABC", "DEF", "UJI"), streamPractice.mapAndCollect(List.of("aBc", "dEF", "ujI")));
    }

    @Test
    void countIntegersOfEmptyListShouldBeEmpty() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(0, streamPractice.countIntegers(List.of()));
    }

    @Test
    void countIntegersOfThreeTensShouldBeTheThree() {
        StreamPractice streamPractice = new StreamPractice();
        List<Integer> list = List.of(10, 10, 10);
        assertEquals(3, streamPractice.countIntegers(list));
    }

    @Test
    void countIntegersOfOneTwoAndNineShouldBeZero() {
        StreamPractice streamPractice = new StreamPractice();
        List<Integer> list = List.of(1, 2, 9);
        assertEquals(0, streamPractice.countIntegers(list));
    }

    @Test
    void countIntegersOfTenAndElevenShouldBeTheTwo() {
        StreamPractice streamPractice = new StreamPractice();
        List<Integer> list = List.of(10, 11);
        assertEquals(2, streamPractice.countIntegers(list));
    }

    @Test
    void findAnyStringOfEmptyListShouldBeEmptyString() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals("", streamPractice.findAnyString(List.of()));
    }

    @Test
    void findAnyStringOfTest1() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals("abc", streamPractice.findAnyString(List.of("abc", "def", "tre")));
    }

    @Test
    void findAnyStringOfTest2() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals("", streamPractice.findAnyString(List.of("bc", "def", "tre")));
    }

    @Test
    void sumOfEmptyListShouldBeZero() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(0, streamPractice.sum(List.of()));
    }

    @Test
    void sumOfOneTwoThreeShouldBeSix() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(6, streamPractice.sum(List.of(1, 2, 3)));
    }

    @Test
    void sumOfOneAndMinusOneShouldBeZero() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(0, streamPractice.sum(List.of(1, -1)));
    }

    @Test
    void averageOfEmptyListShouldBeZero() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(0, streamPractice.average(List.of()));
    }

    @Test
    void averageOfOneAndOneShouldBeOne() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(1, streamPractice.average(List.of(1, 1)));
    }

    @Test
    void averageOfZeroShouldBeZero() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(0, streamPractice.average(List.of(0)));
    }

    @Test
    void collectToSetOfEmptyListShouldBeEmptySet() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(new HashSet<Integer>(), streamPractice.collectToSet(List.of()));
    }

    @Test
    void collectToSetOfOneOneOneShouldBeSetThatContainsOnlyOne() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(Set.of(1), streamPractice.collectToSet(List.of(1, 1, 1)));
    }

    @Test
    void collectToSetOfOneTwoThreeShouldBeSetThatContainsSameValues() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(Set.of(1, 2, 3), streamPractice.collectToSet(List.of(1, 2, 3)));
    }

    @Test
    void groupByLengthTest1() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(Map.of(), streamPractice.groupByLength(List.of()));
    }

    @Test
    void groupByLengthTest2() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(Map.of(1, List.of("a", "b", "c")), streamPractice.groupByLength(List.of("a", "b", "c")));
    }

    @Test
    void groupByLengthTest3() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(Map.of(1, List.of("c"), 2, List.of("ab")), streamPractice.groupByLength(List.of("ab", "c")));
    }

    @Test
    void partitionBy() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(Map.of(true, List.of(1, 3), false, List.of(2)), streamPractice.partitionBy(List.of(1, 2, 3)));
    }

    @Test
    void concatenateString() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals("a,b,c", streamPractice.concatenateStrings(List.of("a", "b", "c")));
    }

    @Test
    void flatMap() {
        StreamPractice streamPractice = new StreamPractice();
        assertEquals(List.of(1, 2, 3, 4), streamPractice.flatMap(List.of(List.of(1, 2), List.of(3, 4))));
    }

}
