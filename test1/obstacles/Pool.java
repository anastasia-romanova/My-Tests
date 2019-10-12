package com.company.obstacles;

import com.company.participants.iChallenagable;

public class Pool extends Obstacle {
    int length;
    public Pool(int length){
        this.length = length;
    }
    @Override
    public void doIt(iChallenagable c){
        c.swim(this.length);
    }
}
