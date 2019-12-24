package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner index = new Scanner(System.in);
        Info info = new Info();
        List<String> list = new ArrayList<>();
        String choice;
        System.out.println("\n\t--- Student Information ---");
        System.out.println("First Name");
        info.fname = index.nextLine();
        list.add(info.fname);
        System.out.println("Last Name");
        info.lname = index.nextLine();
        list.add(info.lname);
        System.out.println("Code");
        info.code = index.nextLine();
        list.add(info.code);
        System.out.println("Age");
        info.age = index.nextLine();
        list.add(info.age);
        System.out.println("Major");
        info.major = index.nextLine();
        list.add(info.major);
        System.out.println("Gerayesh Tahsili");
        info.gerayesh = index.nextLine();
        list.add(info.gerayesh);
        System.out.println("Do you want to show the information?(y/n)");

        choice = index.nextLine();
        if (choice.equals("y")) {
            System.out.println("\n\t__________________");
            for (String str : list) {
                System.out.println(str);
            }
        }
        else{
                System.out.println("\n\t** Thanks for using **");
        }
    }
}
