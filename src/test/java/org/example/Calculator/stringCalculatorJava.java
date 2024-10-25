package org.example.Calculator;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;
import static org.example.Calculator.stringCalculator.isvalidsname;
//import static org.junit.jupiter.api.AssertTrue.assertTrue;

public class stringCalculatorJava {

    @Test
    public void name(){
       String sname="sandhya";
       assertTrue(isvalidsname(sname));


       String sname1="sandhya jagtap";
       assertTrue(isvalidsname(sname1));
    }
}
