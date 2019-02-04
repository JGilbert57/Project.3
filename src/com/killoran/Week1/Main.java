package com.killoran.Week1;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int i = 0;
        int Max = 1000;
        String l[] = new String[Max];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hi there, would you like to make a to do list (1) yes (0) no");
        String a = userInput.nextLine();
        int s = Integer.parseInt(a);
        if (s == 1) {
            add(i, Max, l);
        }
        if (s == 0) {
            System.out.println("Have a nice day");
        }
    }


    public static void add(int i, int Max, String[] l) {
        Max += 1;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your task");
        l[i] = userInput.nextLine();
        i = i + 1;
        System.out.println("If you would like to create another task(1)");
        System.out.println("If you would like to remove a task (2)");
        System.out.println("If you would like to update a task(3)");
        System.out.println("If you would like to display all tasks (4)");
        System.out.println("If you would like to exit the program (5)");
        int choice = userInput.nextInt();
        if (choice == 1) {
            add(i, Max, l);
        }
        if (choice == 2) {
            remove(i, Max, l);
        }
        if (choice == 3) {
            update(i, Max, l);
        }
        if (choice == 4) {
            display(i, Max, l);
        }
        if (choice == 5) {
            end();
        }
    }

    public static void remove(int i, int Max, String[] l) {
        Scanner userInput = new Scanner(System.in);
        for (int j = 0; j < l.length; j++) {
            if (l[j] == null) {
                continue;
            } else {
                System.out.println(j + l[j]);
            }
        }
        System.out.println("Which to do would you like to delete please enter the number assign to the task");
        int removeIndex = userInput.nextInt();
        for (int n = removeIndex; n < l.length - 1; n++) {
            l[n] = l[n + 1];
        }
        System.out.println("If you would like to create another task(1)");
        System.out.println("If you would like to remove a task (2)");
        System.out.println("If you would like to update a task(3)");
        System.out.println("If you would like to display all tasks (4)");
        System.out.println("If you would like to exit the program (5)");
        int choice = userInput.nextInt();
        if (choice == 1) {
            add(i, Max, l);
        }
        if (choice == 2) {
            remove(i, Max, l);
        }
        if (choice == 3) {
            update(i,Max,l);
        }
        if (choice == 4) {
            display(i, Max, l);
        }
        if(choice ==5){
            end();
        }
    }

    public static void update(int i, int Max, String[] l) {
        Scanner userInput = new Scanner(System.in);
        Scanner Input = new Scanner(System.in);
        for (int j = 0; j < l.length; j++) {
            if (l[j] == null) {
                continue;
            } else {
                System.out.println(j + l[j]);
            }
        }
        System.out.println("Please enter the assigned number to the task you wish to update");
        int t = userInput.nextInt();
        System.out.println("Please type your task update below for item " + t);
        String kl = Input.nextLine();
        l[t] = kl;
        System.out.println("If you would like to create another task(1)");
        System.out.println("If you would like to remove a task (2)");
        System.out.println("If you would like to update a task(3)");
        System.out.println("If you would like to display all tasks (4)");
        System.out.println("If you would like to exit the program (5)");
        int choice = userInput.nextInt();
        if(choice ==1)

        {
            add(i, Max, l);
        }
        if(choice ==2)

        {
            remove(i, Max, l);
        }
        if(choice ==3)
            update(i, Max, l);
        {

        }
        if(choice ==4) {
            display(i, Max, l);
        }
        if(choice==5){
            end();
        }

    }
    public static void display(int i, int Max, String[] l) {
        Scanner userInput = new Scanner(System.in);
        int decision = 1;
        while (decision != 0) {
            for (int j = 0; j < l.length; j++) {
                if (l[j] == null) {
                    continue;
                } else {
                    System.out.println(j + l[j]);
                }
            }
            System.out.println("Press (0) to continue the program");
            decision = userInput.nextInt();
        }
        System.out.println("If you would like to create another task(1)");
        System.out.println("If you would like to remove a task (2)");
        System.out.println("If you would like to update a task(3)");
        System.out.println("If you would like to display all tasks (4)");
        System.out.println("If you would like to exit the program (5)");
        int choice = userInput.nextInt();
        if (choice == 1) {
            add(i, Max, l);
        }
        if (choice == 2) {
            remove(i, Max, l);
        }
        if (choice == 3) {
            update(i,Max,l);
        }
        if (choice == 4) {
            display(i, Max, l);
        }
        if (choice ==5 ){
            end();
        }
    }
    public static void end() {
        System.out.println("Have a nice day");
    }
}





