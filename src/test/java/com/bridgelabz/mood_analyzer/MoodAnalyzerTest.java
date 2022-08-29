package com.bridgelabz.mood_analyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageShouldReturnTrue() {
        try {
            String mood = new MoodAnalyzer("Sad").analyseTheMood();
            Assert.assertEquals("SAD", mood);
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMessageShouldReturnMessage() {
        try {
            new MoodAnalyzer(null).analyseTheMood();
        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
        }
    }
}