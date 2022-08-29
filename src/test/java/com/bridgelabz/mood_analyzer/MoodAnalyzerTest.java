package com.bridgelabz.mood_analyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageShouldReturnTrue() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyseTheMood("I am in Sad Mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessageShouldReturnFalse() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyseTheMood("I am in Any Mood");
        Assert.assertEquals("HAPPY",mood);
    }
}