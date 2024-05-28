package com.avb.regularExpression;

// String Class Split() Method
public class RegExDemo07 {

    public static void main(String[] args) {

        String s07="Durga Software Solution";
        String [] s=s07.split(" ");

        for(String s1 : s){

            System.out.println(s1);
        }
    }
}