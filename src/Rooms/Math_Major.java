package Rooms;

import People.Person;

    public class Math_Major extends Room
    {

        public Math_Major(int w, int z) {
            super(w, z);

        }
        public void enterRoom(Person x) {

            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            System.out.println("You found the Math Major Room! Time for some calculus! You'll have fun taking derivatives :)");
        }
    }
