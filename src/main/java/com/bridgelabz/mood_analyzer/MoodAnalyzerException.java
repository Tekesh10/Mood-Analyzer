package com.bridgelabz.mood_analyzer;

public class MoodAnalyzerException extends Exception{
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY;
    }
    ExceptionType exceptionType;
    public MoodAnalyzerException(ExceptionType exceptionType, String message) {
        super(message);
        this.exceptionType = exceptionType;
    }
}
