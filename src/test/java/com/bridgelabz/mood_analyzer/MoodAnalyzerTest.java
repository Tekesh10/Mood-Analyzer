package com.bridgelabz.mood_analyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageShouldReturnTrue() {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = analyzer.analyseTheMood();
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessageShouldReturnFalse() {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Any Mood");
        String mood = analyzer.analyseTheMood();
        Assert.assertEquals("HAPPY",mood);
    }
}