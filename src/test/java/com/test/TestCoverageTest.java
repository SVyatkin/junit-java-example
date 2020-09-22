package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCoverageTest
{
    @Test
    public void testMethod()
    {
        TestCoverage test = new TestCoverage();
        String s = test.testMethod("abc");
        assertEquals("cba", s);
    }
}