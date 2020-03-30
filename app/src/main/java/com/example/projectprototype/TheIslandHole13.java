package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TheIslandHole13 extends AppCompatActivity {

    private Button NextHole;
    private Button PrevHole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_island_hole13);

        NextHole = (Button) findViewById(R.id.NextHole);
        PrevHole = (Button) findViewById(R.id.PrevHole);

        NextHole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheIslandHole14();
            }
        });

        PrevHole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheIslandHole12();
            }
        });
    }
    public void openTheIslandHole14(){
        Intent intent = new Intent(this, TheIslandHole14.class);
        startActivity(intent);
    }

    public void openTheIslandHole12(){
        Intent intent = new Intent(this, TheIslandHole12.class);
        startActivity(intent);
    }


}