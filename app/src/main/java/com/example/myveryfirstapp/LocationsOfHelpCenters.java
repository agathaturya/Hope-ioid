package com.example.myveryfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class LocationsOfHelpCenters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations_page);
    }
    public void findLocations(){
        Intent intent = new Intent(this, LookingForHelpPage.class);
        startActivity(intent);
    }

}
