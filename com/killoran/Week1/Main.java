package com.killoran.Week1;

public class Main {

    public static void main(String[] args) {
        int[] temp = {45, 29, 10, 22, 41, 28, 33};
        int[] precip = {95, 60, 25, 5, 0, 75, 90};
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i <= 6; i++) {
            if (temp[i] <= 32 & precip[i]>=50){
                System.out.println("On " + day[i] + " the temp will be " + temp[i] + " and precipitation will be " + precip [i] +
                        " it will most likely snow");}

        }
    }
}

