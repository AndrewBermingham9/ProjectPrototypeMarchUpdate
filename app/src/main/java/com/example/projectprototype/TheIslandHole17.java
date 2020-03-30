package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TheIslandHole17 extends AppCompatActivity {

    private Button NextHole;
    private Button PrevHole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_island_hole17);

        NextHole = (Button) findViewById(R.id.NextHole);
        PrevHole = (Button) findViewById(R.id.PrevHole);

        NextHole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheIslandHole18();
            }
        });

        PrevHole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheIslandHole16();
            }
        });
    }

    public void openTheIslandHole18() {
        Intent intent = new Intent(this, TheIslandHole18.class);
        startActivity(intent);
    }

    public void openTheIslandHole16() {
        Intent intent = new Intent(this, TheIslandHole16.class);
        startActivity(intent);
    }
}