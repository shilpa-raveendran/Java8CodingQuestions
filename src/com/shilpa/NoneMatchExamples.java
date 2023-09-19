package com.shilpa;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExamples {

    //Example 1: To check that there is no string of length 4.
    public static boolean strNotGreaterThanFour(String str){

        List<String> stringList = Arrays.asList(str.split(" "));
        return stringList.stream().noneMatch(s -> (s.length() == 4));
    }

    //Example 2 : To check that there is no element less than 0.
     public static boolean elementLessThanZero(List<Integer> list){
        return list.stream().noneMatch( i -> i < 0);
     }


    public static void main(String[] args) {
        String toTest="Hello World";
        System.out.println("The str is "+toTest+" : "+NoneMatchExamples.strNotGreaterThanFour(toTest));
        System.out.println();
        List<Integer> listNum = Arrays.asList(2,3,4,55,-2);
        System.out.println("Check that there is no element less than 0: "+NoneMatchExamples.elementLessThanZero(listNum));
    }

}
