package com.company;

import com.company.obstacles.*;
import com.company.participants.Cat;
import com.company.participants.Dog;
import com.company.participants.Team;
import com.company.participants.iChallenagable;

public class Main {
    public static void main(String[] args){
        //        Animal[] animals = {new Cat("Barsik", 1000, 5,0), new Dog("Sharik", 2000, 2, 20)};
        //        Obstacle[] obstacles = {new Cross(500), new Wall(2), new Pool(5)};
        //        for(int i = 0; i < animals.length; i++){
        //            for(int j = 0; j < obstacles.length; j++){
        //                obstacles[j].doIt(animals[i]);
        //                if(!animals[i].onDistance) break;
        //            }
        //        }
        //        System.out.println("Результаты: ");
        //        animals[0].printResult();
        //        animals[1].printResult();
        Team team = new Team("Winners", new iChallenagable[]
                {new Cat("Barsik", 1000, 5, 0),
                        new Dog("Sharik", 2000, 2, 20)});
        Course course = new Course(new Obstacle[]
                {new Cross(500), new Wall(2), new Pool(5), new Cross(800)});
        course.doIt(team);
        team.info();
    }

}
