package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Name :");
        student.setFname(in.next());
        System.out.print("Family name :");
        student.setLname(in.next());
        System.out.print("Riazi 2 = ");
        student.setRiazi2(in.nextDouble());
        System.out.print("\nFizik 2 = ");
        student.setFizik2(in.nextDouble());
        System.out.print("\nMoadelat = ");
        student.setMoadelat(in.nextDouble());
    }
}
