package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {
    public String analyseTheMood(String message) {

        if (message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }
}
