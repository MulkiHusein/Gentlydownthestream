package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * These coding kata on the Stream API can all be completed with a single return line.
 */
public class GentlyDownTheStream {

    protected List<String> fruits;
    protected List<String> veggies;
    protected List<Integer> integerValues;

    public GentlyDownTheStream() {
        fruits = Arrays.asList("Apple", "Orange", "Banana", "Pear", "Peach", "Tomato");
        veggies = Arrays.asList("Corn", "Potato", "Carrot", "Pea", "Tomato");
        integerValues = new Random().ints(0, 1001)
                .boxed()
                .limit(1000)
                .collect(Collectors.toList());
    }

    // TODO - return a list of sorted fruits based on the fruits list
    public List<String> sortedFruits() {
        return fruits.stream()
                .sorted()
                .collect(Collectors.toList());

    }

    // TODO - return a list of sorted fruits with all fruits filtered out that start with "A"
    public List<String> sortedFruitsException() {
        return fruits.stream()
                .filter(a -> a.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
    }

    // TODO - return a list with the first 2 elements of a sorted list of fruits
    public List<String> sortedFruitsFirstTwo() {
        return fruits
        List<String> result2 = fruits
                .stream()

                .sorted()
                .limit(2)


                .collect(Collectors.toList());


    }

    // TODO - return a comma separated String of sorted fruits
    public Stream<String> commaSeparatedListOfFruits() {
        return fruits.stream();
                String fruits = String.joining(",", sortedFruits())
                .collect(Collectors.toList());

    }

    // TODO - return a list of veggies that are sorted in reverse (descending) order
    public List<String> reverseSortedVeggies() {
        return (List<String>) veggies.stream();
        Collections.reverse(Collections.list(veggies));
    }

    // TODO - return a list of veggies that are sorted in reverse order, and all in upper case
    public List<String> reverseSortedVeggiesInUpperCase() {
        return fruits.stream()
                .sorted(Comparator.reverseOrder())
                .map(v -> v.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
    }

    // TODO - return a list of the top 10 values in the list of random integers
    public List<Integer> topTen() {
        return fruits.stream()
                List<Integer> expected = (List<Integer>) integerValues.stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(10)
                        .collect(Collectors.toList());
    }

    // TODO - return a list of the top 10 unique values in the list of random integers
    public List<Integer> topTenUnique() {
        return fruits,veggies.stream()
                List<Integer> expected = integerValues.stream()
                        .sorted(Comparator.reverseOrder())
                        .distinct()
                        .limit(10)
                        .collect(Collectors.toList());
    }

    // TODO - return a list of the top 10 unique values in the list of random integers that are odd
    public List<Integer> topTenUniqueOdd() {
        return fruits,veggies.stream()
        List<Integer> expected = Collections.singletonList(integerValues.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(10)
                .filter(x -> x % 2 == 0)
                .reduce(2, Integer::sum));
    }

    // TODO - return a single value that represents the average of all of your random numbers
    public Double average() {
        return fruits,veggies.stream()
                .mapToInt(i -> Integer.parseInt(i))
                .average()
                .getAsDouble();
        Double actual = average();

    }
}
