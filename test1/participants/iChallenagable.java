package com.company.participants;

public interface iChallenagable {
    void run(int distance);
    void swim(int distance);
    void jump(int height);
    void printResult();
    boolean isOnDistance();
}
