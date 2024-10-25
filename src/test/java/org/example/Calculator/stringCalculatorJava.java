package org.example.Calculator;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
//import static org.example.Calculator.stringCalculator.isvalidsname;
//import static org.junit.jupiter.api.AssertTrue.assertTrue;

public class stringCalculatorJava {

    @Test
    public void toUpperCase(){

        stringCalculator c=new stringCalculator();
        String s1=c.toUpperCase("sandhya");
        assertEquals("SANDHYA",s1);


    }
}
