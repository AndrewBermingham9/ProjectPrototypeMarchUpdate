package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EnterScoreHole1 extends AppCompatActivity {

    private ScoreLibrary mScoreLibrary = new ScoreLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mButtonChoice5;
    private Button mButtonChoice6;


    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber = 0;

    public EnterScoreHole1() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_score_hole1);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mButtonChoice5 = (Button)findViewById(R.id.choice5);
        mButtonChoice6 = (Button)findViewById(R.id.choice6);

        updateQuestion();




        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 2;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(EnterScoreHole1.this, "Great Score!",Toast.LENGTH_SHORT).show();
                }
            }
        });









    }
    private void updateQuestion(){
        mQuestionView.setText(mScoreLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mScoreLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mScoreLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mScoreLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mScoreLibrary.getChoice4(mQuestionNumber));
        mButtonChoice5.setText(mScoreLibrary.getChoice5(mQuestionNumber));
        mButtonChoice6.setText(mScoreLibrary.getChoice6(mQuestionNumber));

        mAnswer = mScoreLibrary.getCorrectAnswer(mQuestionNumber);

    }
    private void updateScore(int point){
        mScoreView.setText(""+mScore);
    }
}
