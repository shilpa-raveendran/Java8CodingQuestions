package com.shilpa;

public class MultiplyTwoNumbsUsingFI{
    public static void main(String[] args) {

        FunctionInterfaceDemo fid = (a, b) -> a*b;
        System.out.println(fid.multiply(5,10));
    }

}
