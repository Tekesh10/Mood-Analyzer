package com.bridgelabz.mood_analyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageNullShouldReturnMessage() {
        try {
            new MoodAnalyzer(null).analyseTheMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL,e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenMessageBlankShouldReturnMessage() {
        try {
            new MoodAnalyzer("").analyseTheMood();
        } catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY,e.exceptionType);
            System.out.println(e.getMessage());
        }
    }
}