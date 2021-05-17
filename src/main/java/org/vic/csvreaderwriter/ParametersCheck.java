package org.vic.csvreaderwriter;

public class ParametersCheck {

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static void print(String output){
        System.out.println(output);
    }

}
