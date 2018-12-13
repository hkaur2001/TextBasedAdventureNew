
package Rooms;

        import People.Person;

        import java.util.Scanner;

public class DistractionRoom extends Room
{
    Person occupant;
    int xLoc,yLoc;
    String contains;

    public DistractionRoom(int a, int b) {
        super(a, b);
        this.contains="[Eng]";
    }
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Uh oh, you have entered your english class.  You have not handed in your assignment from last week and you have been spotted =O");
        Scanner engquestion = new Scanner(System.in);
        System.out.println("What type of word is run?");
        String answer = engquestion.nextLine();
    }
    @Override
    public String toString()
    {
        return this.contains;
    }
}
