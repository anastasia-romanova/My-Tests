package com.company.obstacles;

import com.company.participants.iChallenagable;

public class Cross extends Obstacle {
    int length;
    public Cross(int length){
        this.length = length;
    }
    @Override
    public void doIt(iChallenagable c){
        c.run(this.length);
    }
}
