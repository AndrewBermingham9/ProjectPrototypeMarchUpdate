package com.example.projectprototype;

import java.util.Date;

public class SavedData {

    private SavedData(){

    }

    String GoalInput;
    String SelectDatetv;

    public String getselectdatetv() {return SelectDatetv;}

    public void setselecttv (String SelectDatetv) {this.SelectDatetv = SelectDatetv;}


    public String getgoalinput() {return GoalInput;}

    public void setgoalinput(String GoalInput) {this.GoalInput = GoalInput;}


    public SavedData (String GoalInput,String SelectDatetv){

        this.GoalInput = GoalInput;
        this.SelectDatetv = SelectDatetv;

    }
}
