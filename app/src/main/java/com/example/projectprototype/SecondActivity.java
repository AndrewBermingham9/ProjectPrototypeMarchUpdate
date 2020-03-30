package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private Button logout;
    private Button MyGoals;
    private Button SetHomeCourse;
    private Button ViewHandicap;
    private Button CourseOverview;
    private Button UploadScore;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        firebaseAuth = FirebaseAuth.getInstance();

        logout = (Button) findViewById(R.id.Logoutbtn);
        MyGoals = (Button) findViewById(R.id.MyGoalsbtn);
        SetHomeCourse = (Button) findViewById(R.id.SetHomeCoursebtn);
        ViewHandicap = (Button) findViewById(R.id.ViewHandicapbtn);
        CourseOverview = (Button)findViewById(R.id.CourseOverviewbtn);
        UploadScore = (Button) findViewById(R.id.UploadScorebtn) ;


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });

        UploadScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, UploadScore.class));

            }
        });


        SetHomeCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, SetHomeCourse.class));
            }
        });

        CourseOverview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, CourseOverview.class));
            }
        });
        ViewHandicap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ViewHandicap.class));

            }
        });



        MyGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoalsActivity();
            }
        });
    }
    public void openGoalsActivity(){
        Intent intent = new Intent(this, GoalsActivity.class);
        startActivity(intent);
    }




}
