package com.java8.examples.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapFindMin {

    public static void main(String[] args) {
        Map<String, Integer> votesInt = new HashMap<>();
        List<String> votes = Arrays.asList("Laddu", "Laddu", "Gulab Jamum");
        votes.forEach(e -> votesInt.compute(e, (k, v) -> v != null ? v + 1 : 1));

        String result = votesInt.entrySet().stream().min((e1, e2) -> {
            if (e1.getValue().compareTo(e2.getValue()) != 0)
            {
                return e2.getKey().compareTo(e1.getKey());
            }
            else
            {
                return e1.getValue().compareTo(e2.getValue());
            }
        }).get().getKey();

        System.out.println(result);
    }
}
