package com.nesProject.screenmatch.exceptions;

public class TimeConvertionException extends RuntimeException {

    private String mesaje;



    public TimeConvertionException(String mesaje) {
        this.mesaje = mesaje;
    }

    public String getMesaje() {
        return this.mesaje;
    }
}
