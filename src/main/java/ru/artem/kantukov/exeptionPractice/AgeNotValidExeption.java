package ru.artem.kantukov.exeptionPractice;

class AgeNotValidException extends Exception{
    public AgeNotValidException(String errorBad) {
        super(errorBad);
    }

}