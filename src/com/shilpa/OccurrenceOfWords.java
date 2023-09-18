package com.shilpa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfWords {
    public static void main(String[] args) {

        String input = "Hello All Welcome to Java programming All";
        String[] inpStr = input.split(" ");

        //Using HashMap
        System.out.println("======Using HashMap=====");
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < inpStr.length; i++) {
            hm.put(inpStr[i], hm.getOrDefault(inpStr[i], 0) + 1);
        }
        for (Map.Entry<String,Integer> entries: hm.entrySet()) {
            System.out.println(entries.getKey()+" || "+entries.getValue());
        }
        System.out.println();

        //Using Streams
        System.out.println("======Using Streams=====");
        List<String> list= Arrays.asList(input.split(" "));
        Map<String, Long> hmStreams = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(hmStreams);
        //Without using collections

    }
}
