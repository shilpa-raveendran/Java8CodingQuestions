package com.shilpa;

public class Refractor {

    public static void main(String[] args) {
        System.out.println(Refractor.isPrime(11));


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
}
