package com.example.controller;

import java.util.Arrays;

public class Test {
    public static String findLargest(String[] str){
        Arrays.sort(str,(num1,num2)->(num2+num1).compareTo(num1+num2));

        String s = "";
        for(String s1:str){
            s = s + s1;
        }
        return s;
    }
    public static void main(String[] args) {
        String[] str = {"3","30","4","45","9"};
        System.out.println(findLargest(str));
    }
}
