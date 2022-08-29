package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {
    private final String message;
    public MoodAnalyzer(String message) throws MoodAnalyzerException {
        this.message = message;
    }
    public String analyseTheMood() throws  MoodAnalyzerException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY,"Please enter a mood");
            }
            if (message.contains("Sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            throw  new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL,"Please provide a valid input");
        }
    }
}