package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice {

    public StreamPractice() {
    }

    // 1. Filter and Collect to List: Given a list of integers, filter out the odd numbers and collect the remaining even numbers into a new list.
    public List<Integer> fitlerAndCollect(List<Integer> list) {
        return list.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
    }

    // 2. Map and Collect to List: Given a list of strings, convert each string to uppercase and collect the results into a new list.
    public List<String> mapAndCollect(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }

    // 3. Count Elements: Given a list of integers, count how many integers are greater than 10.
    public long countIntegers(List<Integer> list) {
        return list.stream().filter(x -> x >= 10).count();
    }

    // 4. Find Any: Given a list of strings, find any string that starts with the letter "a".
    public String findAnyString(List<String> words) {
        return words.stream().filter(word -> word.startsWith("a")).findFirst().orElse("");
    }

    // 5. Sum of Elements: Given a list of integers, find the sum of all elements.
    public int sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(x -> x).sum();
    }

    // 6. Average of Elements: Given a list of doubles, find the average of all elements.
    public double average(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    // 7. Collect to Set: Given a list of integers, collect the unique elements into a set.
    public Set<Integer> collectToSet(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.toSet());
    }

    // 8. Group By Length: Given a list of strings, group the strings by their length.
    public Map<Integer, List<String>> groupByLength(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(String::length));
    }

    // 9. Partitioning By: Given a list of integers, partition the list into two lists: one with even numbers and one with odd numbers.
    public Map<Boolean, List<Integer>> partitionBy(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.partitioningBy(number -> number % 2 == 1));
    }

    // 10. Custom Collector: Create a custom collector to concatenate strings in a list, separated by a comma.
    public String concatenateStrings(List<String> words) {
        return words.stream().collect(Collectors.joining(","));
    }

    // 11. FlatMap: Given a list of lists of integers, flatten the lists into a single list of integers.
    public List<Integer> flatMap(List<List<Integer>> numbers) {
        return numbers.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
