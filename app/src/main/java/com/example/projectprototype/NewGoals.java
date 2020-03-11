package com.example.projectprototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class NewGoals extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private Button save;
    private Button Datebtn;
    private EditText GoalInput;
    private TextView SelectDatetv;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_goals);


        GoalInput = (EditText) findViewById(R.id.GoalInput);
        save = (Button) findViewById(R.id.save);
        Datebtn = (Button) findViewById(R.id.Datebtn);
        SelectDatetv = (TextView) findViewById(R.id.SelectDatetv);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Goals");




        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddData();
                openSecondActivity();

            }
        });

        Datebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");

            }
        });


    }

    public void AddData() {
        String goalinput = GoalInput.getText().toString().trim();
        String selectdatetv = SelectDatetv.getText().toString().trim();
        SavedData savedData = new SavedData(goalinput,selectdatetv);
        databaseReference.push().setValue(savedData);
        Toast.makeText(getApplication(),"Saved Successfully", Toast.LENGTH_LONG).show();
    }






    @Override


    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView SelectDatetv = (TextView) findViewById(R.id.SelectDatetv);
        SelectDatetv.setText(currentDateString);


    }

    public void openSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }



}
