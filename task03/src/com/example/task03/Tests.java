package com.example.task03;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testAdd(){
        Complex complex1 = new Complex(1., 2.);
        Complex complex2 = new Complex(3., 4.);
        Complex result = complex1.Add(complex2);
        Assert.assertEquals(4., result.getReal(), 9);
    }
    @Test
    public void testMultiply(){
        Complex complex1 = new Complex(1., 2.);
        Complex complex2 = new Complex(3., 4.);
        Complex result = complex1.Add(complex2);
        Assert.assertEquals(11., result.getImaginary(),9);
    }
}
