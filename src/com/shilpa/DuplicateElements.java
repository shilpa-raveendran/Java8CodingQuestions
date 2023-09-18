package com.shilpa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {


        //int[] inpArray= {33,10,28,39,67,32,28,10,66,33,41};
        List<Integer> list= Arrays.asList(33,10,28,39,67,32,28,10,66,33,41,33);
        //output: 33,10,28

        Set<Integer> hs = new HashSet<>();
        list.stream().filter(x -> !hs.add(x)).distinct().forEach(i->System.out.println(i));



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
