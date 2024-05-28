package com.avb.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo10 {

    public static void main(String[] args) {

        Pattern p10=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m10=p10.matcher(args[0]);

        if(m10.find() && m10.group().equals(args [0])){
            System.out.println("Valid Mob No.");
        }else {
            System.out.println("Invalid Mob No");
        }
    }

}
