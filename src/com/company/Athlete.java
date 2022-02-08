package com.company;

public abstract class Athlete implements IAthlete{
    public String name;

    public Athlete(String name){
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sayHooray() {
        System.out.println("Hooray!");
    }
}
