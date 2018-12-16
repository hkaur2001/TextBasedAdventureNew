package Rooms;
import Item.ProblemSet;
import People.Person;


    public class Math_ProblemSetRoom extends Room implements ProblemSet {
        boolean alive = true;
        public GhostKeyRoom(int x, int y){
            super(x,y);
        }
        public boolean hasProblemSet(Person x) {
            if (beenthere == true){
                x.ProblemSet = true;
            }
            return x.ProblemSet;
        }
        public void enterRoom(Person x)
        {
            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            beenthere = true;
            hasProblemSet(x);
            System.out.println("This room contains a Ghostkey!");
        }
        /**
         * Removes the player from the room.
         * @param x
         */
        public void leaveRoom(Person x)
        {
            occupant = null;
        }
        public String toString(){
            if (isThere){
                return "{*}";}
            else{
                return "{?}";
            }
        }
    }

}
