package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SetHomeCourse extends AppCompatActivity {


    private Button HomeCoursebtn;
    private EditText HomeCourseet;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_home_course);



        HomeCourseet  = (EditText) findViewById(R.id.HomeCourseet);
        HomeCoursebtn = (Button) findViewById(R.id.HomeCoursebtn);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Courses");







        HomeCoursebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddData();
                openSecondActivity();

            }
        });



    };

    public void AddData(){

        String homecourseet = HomeCourseet.getText().toString().trim();
        CourseData courseData = new CourseData(homecourseet);
        databaseReference.push().setValue(courseData);
        Toast.makeText(getApplication(),"Saved Successfully", Toast.LENGTH_LONG).show();
    }


    public void openSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}


