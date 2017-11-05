package com.example.myveryfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LookingForHelpPage extends AppCompatActivity {
    private final static String EXTRA_MESSAGE = "com.example.myveryfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looking_for_help_page);
    }
    public void findLocations(View view){
        Intent intent = new Intent(this, LocationsOfHelpCenters.class);
        startActivity(intent);
    }

}
