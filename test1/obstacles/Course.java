package com.company.obstacles;

import com.company.participants.Team;

public class Course {
    private Obstacle[] obstacles;
    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for(int i = 0; i < team.getParticipants().length; i++){
            for(int j = 0; j < obstacles.length; j++){
                obstacles[j].doIt(team.getParticipants()[i]);
                if(!team.getParticipants()[i].isOnDistance()) break;
            }
        }
    }
}
