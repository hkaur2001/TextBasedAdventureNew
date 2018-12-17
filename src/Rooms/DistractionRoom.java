package Rooms;

import People.Person;

import java.util.Scanner;

public class DistractionRoom extends Room
{
    Person occupant;
    int xLoc,yLoc;
    String contains;

    String[] questions;
    String[] answers;
    int questionNumber;

    public DistractionRoom(int a, int b) {
        super(a, b);
        this.contains="[Eng]";

        questions = new String[2];
        answers = new String[2];
        questionNumber = (int) Math.random() * 2 +1;
        questions[0] = "What type of word is run?";
        answers[0] = "verb";
        questions[1] = "What is a comparison using like or as?";
        answers[1] = "simile";
    }



    public boolean checkAnswer(String userAnswer){
        if(userAnswer.toLowerCase().equals(answers[questionNumber].toLowerCase())){
            return true;
        }
        return false;

    }

    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Uh oh, you have entered your english class.  You have not handed in your assignment from last week and you have been spotted =O");
        Scanner engquestion = new Scanner(System.in);
        System.out.println(questions[questionNumber]);
        String answer = engquestion.nextLine();
        boolean isRight = checkAnswer(answer);
    }
    @Override
    public String toString()
    {
        return this.contains;
    }
}