package org.example.Calculator;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorJava {

    @Test
    public void testAddition(){
        Calculator c=new Calculator();
        int result=c.add(3,2);
        assertEquals(5,result);
    }

//    @Test
//    public void testSubstrction(){
//        Calculator c=new Calculator();
//        int result=c.sub(4,2);
//        assertEquals(2,result);
//    }
}
