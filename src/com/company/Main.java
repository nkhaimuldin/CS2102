package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<IAthlete> athletes = new ArrayList<>();
        athletes.add(new JumpingSwimmer("Jones"));

        IAthlete athlete = new JumpingSwimmer("James");
        athlete.compete();
        athlete.sayHooray();
    }
}
