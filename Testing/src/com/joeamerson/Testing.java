package com.joeamerson;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class Testing {
    SomeFunction TestF ;
    @Before
    public void setup(){
       TestF = new SomeFunction();

    }
    @Test
    public void SumTest(){
        assertEquals(TestF.sum(1,1), 2 );
    }
    @Test
    public void findOutTest(){
        assertSame(TestF.findOut(3),3 );
    }

}
