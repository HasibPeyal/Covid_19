package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.firebase.client.Firebase;


public class Feedback extends AppCompatActivity {

    private Firebase Ref;
    private EditText username, feedback ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    //gradient code
        ConstraintLayout constraintLayout = findViewById(R.id.coordinator);
        AnimationDrawable animationDrawable= (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //gradient code

        username=(EditText)findViewById(R.id.username);
        feedback= (EditText)findViewById(R.id.feedback);
        Firebase.setAndroidContext(this);
        Ref=new Firebase("https://covid-61d96.firebaseio.com/");



    }
    public void feedbacksent (View view){

    String usernameinput = username.getText().toString();
    String feedbackinput = feedback.getText().toString();
    Firebase Reusername = Ref.child("Username");
    Reusername.setValue(usernameinput);
    Firebase Reffeedback= Ref.child("Feedback");
    Reffeedback.setValue(feedbackinput);


    }





}
