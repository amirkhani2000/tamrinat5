package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Entrance entrance = new Entrance("armansh","4413");
        String username , password , choose;
        System.out.println("\n\t* Welcome to ONLINE TICKET *");
        while (true) {
            System.out.println("  Username:");
            username = input.next();
            System.out.println("  Password:");
            password = input.next();
            if (username.equals(entrance.getUser()) && password.equals(entrance.getPass())) {
                TicketInfo ticketInfo = new TicketInfo();
                System.out.println("\n");
                System.out.println(ticketInfo.fname);
                System.out.println(ticketInfo.lname);
                System.out.println(ticketInfo.date);
                System.out.println(ticketInfo.time);
                break;
            }
            else{
                System.out.println("ERROR! (Incorrect Username or Password)\n");
                System.out.println("  Enter correct Username and Password");
            }
        }
        System.out.println("\n  Buying the ticket? (yes/no)");
        choose = input.next();
        if (choose.equals("yes")){
            System.out.println("  Ticket successfully reserved");
            System.out.println("Thanks for your purchase :)");
        }
        else if (choose.equals("no")){
            System.out.println(" -- Ticket wasn't bought ! --");
        }
    }
}
