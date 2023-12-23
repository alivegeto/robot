package com.practice;

public class Robot {


    String name;
    int age;

    int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public boolean fight(Robot robot){
        if(robot.power < power){
            return true;
        }
        else{
            return false;
        }

    }
}
