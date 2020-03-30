package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ScoreLibrary extends AppCompatActivity {

    private String mQuestions [] = {
            "Enter Score",
            "Enter Score",
            "Enter Score",
            "Enter Score"

    };

    private String mChoices [][] = {
            {"Eagle: 2","Birdie: 3", "Par: 4", "Bogey: 5", "Double Bogey: 6", "Triple or worse: 7+"},
            {"Eagle: 2","Birdie: 3", "Par: 4", "Bogey: 5", "Double Bogey: 6", "Triple or worse: 7+"},
            {"Eagle: 2","Birdie: 3", "Par: 4", "Bogey: 5", "Double Bogey: 6", "Triple or worse: 7+"},
            {"Eagle: 2","Birdie: 3", "Par: 4", "Bogey: 5", "Double Bogey: 6", "Triple or worse: 7+"}

    };

     private String mCorrectAnswers[]  = {"\"Eagle: 2\",\"Birdie: 3\", \"Par: 4\", \"Bogey: 5\", \"Double Bogey: 6\", \"Triple or worse: 7+\""};

     public String getQuestion(int a){
         String score = mQuestions[a];
         return score;
     }

     public String getChoice1(int a){
         String choice0 = mChoices[a][0];
         return choice0;
     }
    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }
    public String getChoice5(int a) {
        String choice4 = mChoices[a][4];
        return choice4;
    }
    public String getChoice6(int a) {
        String choice5 = mChoices[a][5];
        return choice5;
    }

    public String getCorrectAnswer(int a){
         String answer = mCorrectAnswers[a];
         return answer;
    }
}
