package com.avb.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Character Classes
public class RegExDemo02 {

    public static void main(String[] args) {

        //Pattern p02=Pattern.compile("[a-z]");
        //Pattern p02=Pattern.compile("[^a-z]");
        //Pattern p02=Pattern.compile("[abc]");
        //Pattern p02=Pattern.compile("[^abc]");
        //Pattern p02=Pattern.compile("[0-9]");
        //Pattern p02=Pattern.compile("[a-zA-Z0-9]");
        Pattern p02=Pattern.compile("[^a-zA-Z0-9]");
        Matcher m02=p02.matcher("a3b#k@qZ");

        while(m02.find()){

            System.out.println(m02.start()+"............"+m02.group());
        }
    }
}
