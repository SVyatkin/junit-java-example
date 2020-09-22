package com.test;

public class TestCoverage
{
    public String testMethod(String str){
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
}
