package Rooms;

import People.Person;

    public class Math_Major extends Room
    {
        Person occupant;
        int xLoc,yLoc;
        String contains;

        public Math_Major(int w, int z) {
            super(w, z);
            this.contains="[M]";
        }
        public void enterRoom(Person x) {

            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            System.out.println("You found the Math Major Room! Time for some calculus! You'll have fun taking derivatives :)");
        }
        @Override
        public String toString()
        {
            return this.contains;
        }
    }
