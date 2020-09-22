package com.test;

public class TestCoverage
{
    public String testMethod(String str){
        StringBuffer sb = new StringBuffer(str);
        String s = sb.reverse().toString();
        return s;
    }
}
