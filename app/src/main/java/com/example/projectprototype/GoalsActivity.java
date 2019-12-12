package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoalsActivity extends AppCompatActivity {
    private Button NewGoals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);

        NewGoals = (Button) findViewById(R.id.NewGoalsbtn);

        NewGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewGoals();
            }
        });
    }

    public void openNewGoals(){
        Intent intent = new Intent(this, NewGoals.class);
        startActivity(intent);
    }
}
