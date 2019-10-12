package com.company.participants;

public class Animal implements iChallenagable {
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected int maxSwimDistance;
    protected boolean onDistance;

    protected String name;
    protected String type;

    public Animal(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }
    public void run(int distance){
        if(distance <= this.maxRunDistance) System.out.println(this.type + " " + this.name + " " + " пробежал дистанцию");
        else{
            this.onDistance = false;
            System.out.println(this.type + " " + this.name + " не пробежал дистанцию");
        }
    }
    public void jump(int height){
        if(height <= this.maxJumpHeight) System.out.println(this.type + " " + this.name + " " + " перепгрынул препятствие");
        else{
            this.onDistance = false;
            System.out.println(this.type + " " + this.name + " не перепгрынул препятствие");
        }
    }
    public void swim(int distance){
        if(this.maxSwimDistance == 0){
            this.onDistance = false;
            System.out.println(this.type + " " + this.name + " плавать не умеет");
        }
        if(distance <= this.maxSwimDistance) System.out.println(this.type + " " + this.name + " " + " проплыл дистанцию");
        else{
            this.onDistance = false;
            System.out.println(this.type + " " + this.name + " не проплыл дистанцию");
        }
    }
    public void printResult(){
        if(onDistance) System.out.println(this.type + " " + this.name + " прошел дистанцию");
        else System.out.println(this.type + " " + this.name + " не прошел дистанцию");
    }
    @Override
    public boolean isOnDistance(){
        return onDistance;
    }
}
