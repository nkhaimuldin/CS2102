package com.company;

public class JumpingSwimmer extends Swimmer implements IJumpingAthlete{

    public JumpingSwimmer(String name){
        super(name);
    }

    @Override
    public void compete() {
        System.out.println(getName() + " started competing");
        jump();
        swim();
    }

    @Override
    public void jump() {
        System.out.println("Started jumping");
    }

}
