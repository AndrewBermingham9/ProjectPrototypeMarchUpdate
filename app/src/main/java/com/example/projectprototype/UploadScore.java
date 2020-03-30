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

public class UploadScore extends AppCompatActivity {

    private EditText EnterScoreet;
    private Button EnterScorebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_score);


        EnterScoreet  = (EditText) findViewById(R.id.EnterScoreet);
        EnterScorebtn = (Button) findViewById(R.id.EnterScorebtn);


        EnterScorebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }
        });

    }

    public void Check() {
        if (EnterScoreet.getText().toString().equals("The Island Golf Club")){
            Toast.makeText(UploadScore.this, "The Island Golf Club", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(UploadScore.this, EnterScoreHole1.class));
        }else{
            Toast.makeText(this, "Course Overview not available for this golf club at this time", Toast.LENGTH_LONG).show();
        }
    }
}
