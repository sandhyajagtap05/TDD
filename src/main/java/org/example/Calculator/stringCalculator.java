package org.example.Calculator;

public class stringCalculator {

    public static void main(String[] args) {
        System.out.println("hello");
        String sname="Sandhya";
        isvalidsname(sname);
    }

    static boolean isvalidsname(String name){
       if( name.contains("@")|| name.contains("")){
           return  false;
       }
       return  true;
    }

}
