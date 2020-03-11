package com.example.projectprototype;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class ViewHandicap extends AppCompatActivity {

     Button AddHandicapbtn;
     EditText AddHandicapet;


     DatabaseReference databaseReference;



     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_viewhandicap);

         AddHandicapet  = (EditText) findViewById(R.id.AddHandicapet);
         AddHandicapbtn = (Button) findViewById(R.id.AddHandicapbtn);


         databaseReference = FirebaseDatabase.getInstance().getReference().child("Handicaps");




         AddHandicapbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 AddData();
                 openSecondActivity();

             }
         });
     }

    public void AddData(){

        String addhandicapet = AddHandicapet.getText().toString().trim();
        HandicapData handicapData = new HandicapData(addhandicapet);
        databaseReference.push().setValue(handicapData);
        Toast.makeText(getApplication(),"Saved Successfully", Toast.LENGTH_LONG).show();
    }


    public void openSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}


