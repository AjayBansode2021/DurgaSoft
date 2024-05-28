package com.avb.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Predefined Character Classes
public class RegExDemo03 {

    public static void main(String[] args) {

        //Pattern p03=Pattern.compile("x");
        //Pattern p03=Pattern.compile("\\s");
        //Pattern p03=Pattern.compile("\\S");
        //Pattern p03=Pattern.compile("\\d");
        //Pattern p03=Pattern.compile("\\D");
        //Pattern p03=Pattern.compile("\\w");
        //Pattern p03=Pattern.compile("\\W");
        Pattern p03=Pattern.compile(".");
        Matcher m03=p03.matcher("a7b k@9z");

        while(m03.find()){
            System.out.println(m03.start()+"............."+m03.group());
        }
    }
}
