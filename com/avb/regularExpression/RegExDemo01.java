package com.avb.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo01 {

    public static void main(String[] args) {

        int count=0;
        Pattern p01= Pattern.compile("ab");
        Matcher m01=p01.matcher("abbabbba");
                                 //01234567//
        while (m01.find()){
            count++;
            System.out.println(m01.start()+"........."+m01.end()+"................"+m01.group());
        }
        System.out.println("Total No of Occrences are : "+count);
    }
}
