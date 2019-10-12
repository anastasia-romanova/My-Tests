package com.company.participants;

public class Team {
    private String name;
    private iChallenagable[] participants;

    public Team(String name, iChallenagable[] participants){
        this.name = name;
        this.participants = participants;
    }
    public iChallenagable[] getParticipants(){
        return participants;
    }
    public void info(){
        System.out.println("Team: " + this.name);
        for(iChallenagable p: participants){
            p.printResult();
        }
    }
}
