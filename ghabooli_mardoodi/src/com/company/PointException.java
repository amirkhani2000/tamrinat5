package com.company;

public class PointException extends Exception {
    //az Exception estefade nakardm.

    public PointException(String message){
        super(message);
    }
    public PointException(){}

    public void checkpoint(double nomre) throws PointException{
        System.out.println("Start");
        if (nomre<10){
            throw new PointException("Mardood !");
        }
        else{
            System.out.println("Ghabool");
        }
        System.out.println("End");
    }
}
