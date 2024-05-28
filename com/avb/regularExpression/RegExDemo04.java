package com.avb.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Quantifier
public class RegExDemo04 {

    public static void main(String[] args) {

        //Pattern p04=Pattern.compile("x");
        //Pattern p04=Pattern.compile("a");
        //Pattern p04=Pattern.compile("a+");
        //Pattern p04=Pattern.compile("a*");
        Pattern p04=Pattern.compile("a?");
        Matcher m04=p04.matcher("abaabaaab");

        while(m04.find()){
            System.out.println(m04.start()+"......."+m04.group());
        }
    }
}
