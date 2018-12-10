package Rooms;

import People.Person;

import java.util.Scanner;

public class DistractionRoom extends Room
{

    public DistractionRoom(int w, int z) {
        super(w, z);

    }
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Uh oh, you have entered your english class.  You have not handed in your assignment from last week and you have been spotted =O");
        Scanner getout = new Scanner(System.getout);
        while()

    }
}
