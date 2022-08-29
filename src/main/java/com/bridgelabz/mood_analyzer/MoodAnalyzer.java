package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {
    private final String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public String analyseTheMood() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}