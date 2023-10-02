package com.shilpa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {


        //int[] inpArray= {33,10,28,39,67,32,28,10,66,33,41};
        List<Integer> list= Arrays.asList(33,10,28,39,67,32,28,10,66,33,41,33);
        //output: 33,10,28

        Set<Integer> hs = new HashSet<>();
        //list.stream().filter(x -> !hs.add(x)).distinct().forEach(i->System.out.println(i));
        Set<Integer> dupElemnt= list.stream().filter(x ->!hs.add(x)).collect(Collectors.toSet());
        dupElemnt.forEach(x-> System.out.println(x));
        System.out.println("=====Unique set=====");
        hs.forEach(x-> System.out.println(x));


        //finding it using map technique
        // with key has integer and value as the frequency of occurrence

        Map<Integer,Long> map=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
        Set<Integer> dupSet= map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());
        System.out.println("====Collecting to a Set=====");
        dupSet.forEach(x-> System.out.println(x));

        System.out.println("====iterating through a map=====");
        //Iterate through map and find the duplicates
        for(Map.Entry<Integer,Long> entries : map.entrySet()){
            if(entries.getValue() > 1){
                System.out.println(entries.getKey());
            }
        }

        //Using Collectors.frequency
        System.out.println("====Using Collectors.frequency=====");
        list.stream().filter(x -> Collections.frequency(list,x) >1)
                .collect(Collectors.toSet())
                .forEach( i-> System.out.println(i));


//        Set<Integer> hs= new HashSet<>();
//        Set<Integer> result= new HashSet<>();
//        for (int i= 0 ; i < inpArray.length ; i++) {
//            if(hs.contains(inpArray[i])){
//                result.add(inpArray[i]);
//            }
//            hs.add(inpArray[i]);
//        }
//        for (Integer i:result) {
//            System.out.println(i);
//        }
    }
}
