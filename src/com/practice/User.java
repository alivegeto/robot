package com.practice;

public class User {
    private String name;
    private int age;

    User(int age, String name, String password){
        this.age = age;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String xname) {
        name = xname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void talk(String talk) {
        System.out.println(talk);
    }



    }


