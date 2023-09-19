package com.shilpa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Refactor {

    public static void main(String[] args) {
        System.out.println(Refactor.isPrime(11));
        System.out.println("Prime no using Stream: "+ Refactor.isPrimeUsingStream(12));

        Refactor.getSqrtOf10Prime();
        Refactor.getSqrtOf10PrimeUsingStream();
        System.out.println();
    }
    public static boolean isPrime(int num){
        boolean isDivisible=false;
        for(int i =2; i <num; i++) {
            if (num % i == 0) {
                isDivisible = true;
                break;
            }
        }
        return num >1 && !isDivisible;
    }

    public static boolean isPrimeUsingStream(int num){

        return num >1 && IntStream.range(2,num).noneMatch(n -> num %n == 0);
    }

    public static void getSqrtOf10Prime(){
        List<Double> sqrtOf10Prime =new ArrayList<>(10);
        int index=1;

        while(sqrtOf10Prime.size() <10){
            if( isPrime(index)){
                sqrtOf10Prime.add(Math.sqrt(index));
            }
            index++;
        }
        System.out.println(sqrtOf10Prime);
    }
    public static void getSqrtOf10PrimeUsingStream(){
        List<Double> sqrtOf10Prime = Stream.iterate(1, i -> i + 1)
                .filter(Refactor::isPrimeUsingStream).peek(System.out::println)
                .map(Math::sqrt)
                .limit(10).toList();
        System.out.println("In Stream: "+sqrtOf10Prime);
    }
}
