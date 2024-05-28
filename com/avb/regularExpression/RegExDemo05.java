package com.avb.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern Class split() method
public class RegExDemo05 {

    public static void main(String[] args) {

        Pattern p05=Pattern.compile("\\s");
        String [] s05=p05.split("Durga Software Solution");

        for(String s1: s05){
            System.out.println(s1);
        }
    }
}
