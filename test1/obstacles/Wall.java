package com.company.obstacles;

import com.company.participants.iChallenagable;

public class Wall extends Obstacle {
    int height;
    public Wall(int height){
        this.height = height;
    }
    @Override
    public void doIt(iChallenagable c){
        c.jump(this.height);
    }
}
