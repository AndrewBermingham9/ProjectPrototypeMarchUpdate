package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CourseOverview extends AppCompatActivity {

    private EditText CourseOverviewet;
    private Button ViewCoursebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_overview);


        CourseOverviewet  = (EditText) findViewById(R.id.CourseOverviewet);
        ViewCoursebtn = (Button) findViewById(R.id.ViewCoursebtn);


        ViewCoursebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }
        });

    }

    public void Check() {
        if (CourseOverviewet.getText().toString().equals("The Island Golf Club")){
            Toast.makeText(CourseOverview.this, "The Island Golf Club", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(CourseOverview.this, TheIslandCourseGuide.class));
        }else{
            Toast.makeText(this, "Course Overview not available for this golf club at this time", Toast.LENGTH_LONG).show();
        }
    }
}

