package com.company;

public class Student {

    private String fname;
    private String lname;
    private double riazi2;
    private double fizik2;
    private double moadelat;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getRiazi2() {
        return riazi2;
    }

    public void setRiazi2(double riazi2) {
        if (riazi2<10){
            System.out.println("\tMardood !");
        }
        else{
            System.out.println("\tGhabool");
        }
        this.riazi2 = riazi2;
    }

    public double getFizik2() {
        return fizik2;
    }

    public void setFizik2(double fizik2) {
        if (fizik2<10){
            System.out.println("\tMardood !");
        }
        else{
            System.out.println("\tGhabool");
        }
        this.fizik2 = fizik2;
    }

    public double getMoadelat() {
        return moadelat;
    }

    public void setMoadelat(double moadelat) {
        if (moadelat<10){
            System.out.println("\tMardood !");
        }
        else{
            System.out.println("\tGhabool");
        }
        this.moadelat = moadelat;
    }
}
