package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TheIslandHole1 extends AppCompatActivity {

    private Button NextHole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_island_hole1);

        NextHole = (Button) findViewById(R.id.NextHole);

        NextHole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheIslandHole2();
            }
        });
    }
    public void openTheIslandHole2(){
        Intent intent = new Intent(this, TheIslandHole2.class);
        startActivity(intent);
    }


}
