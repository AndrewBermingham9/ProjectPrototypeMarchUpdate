package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoalsActivity extends AppCompatActivity {
    private Button NewGoals;
    private Button CurrentGoals;
    private Button CourseTipsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);

        NewGoals = (Button) findViewById(R.id.NewGoalsbtn);
        CurrentGoals = (Button) findViewById(R.id.CurrentGoalsbtn);
        CourseTipsbtn = (Button)  findViewById(R.id.CourseTipsbtn);

        CurrentGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCurrentGoals();
            }
        });

        NewGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewGoals();
            }
        });

        CourseTipsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCourseTips();
            }
        });
    }




    public void openNewGoals(){
        Intent intent = new Intent(this, NewGoals.class);
        startActivity(intent);
    }

    public void openCurrentGoals(){
        Intent intent = new Intent(this, CurrentGoals.class);
        startActivity(intent);
    }

    public void openCourseTips(){
        Intent intent = new Intent (this, CourseTips.class);
        startActivity(intent);
    }
}
