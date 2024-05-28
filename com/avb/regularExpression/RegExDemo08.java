package com.avb.regularExpression;

import java.util.StringTokenizer;

//String Tokenizer class
public class RegExDemo08 {

    public static void main(String[] args) {

        StringTokenizer st08=new StringTokenizer("Durga Software Solution");

        while (st08.hasMoreTokens()){

            System.out.println(st08.nextToken());
        }

    }
}
