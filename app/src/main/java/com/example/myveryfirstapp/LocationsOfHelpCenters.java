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
        //TextView textView =(TextView)findViewById(R.id.drugRehabLink);
        //textView.setClickable(true);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());
//        String text = "<a href='http://www.drugrehab.com'> Drug Rehab </a>";
//        textView.setText(Html.fromHtml(text));
        setContentView(R.layout.activity_locations_page);
    }
    public void findLocations(){
        Intent intent = new Intent(this, LookingForHelpPage.class);
        startActivity(intent);
    }

}
