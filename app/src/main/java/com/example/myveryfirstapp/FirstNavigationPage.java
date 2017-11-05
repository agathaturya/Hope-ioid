package com.example.myveryfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstNavigationPage extends AppCompatActivity {
    private final static String EXTRA_MESSAGE = "com.example.myveryfirstapp.MESSAGE";
    public String userName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //get the string that was passed from Intent
        Intent intent = getIntent();
        userName=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        String message="Hi, " + userName+"!";


        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

    }

    public void helpPage(View view){
        Intent intent = new Intent(this, LookingForHelpPage.class);
        startActivity(intent);
    }
    public void willingToHelp(View view){
        Intent intent=new Intent(this, WillingToHelpActivity.class);
        startActivity(intent);
    }
}
