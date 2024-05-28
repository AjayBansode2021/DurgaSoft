package com.avb.regularExpression;

import java.util.regex.Pattern;

//Pattern Class split() Method
public class RegExDemo06 {

    public static void main(String[] args) {

        //Pattern p06=Pattern.compile("\\.");
        Pattern p06=Pattern.compile("[.]");
        String [] s06=p06.split("www.durgaSoft.com");

        for(String s1 : s06){

            System.out.println(s1);
        }
    }
}
