package com.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Robot user1 = new Robot("Vova",15,15);
        Robot user2  = new Robot("Kolya", 9,19);

        if(user1.fight(user2)){
            System.out.println("Виграв " + user1.name + "!!!!!!");
        }
        else{
            System.out.println("Виграв " + user2.name + "!!!!!!");
        }
    }


}
