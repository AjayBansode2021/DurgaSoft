package com.avb.regularExpression;

import java.util.StringTokenizer;

public class RegExDemo09 {

    public static void main(String[] args) {

        StringTokenizer st09=new StringTokenizer("14-04-2024", "-");

        while(st09.hasMoreTokens()){

            System.out.println(st09.nextToken());
        }
    }
}
