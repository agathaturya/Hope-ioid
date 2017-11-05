package com.example.myveryfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  TextView textView =(TextView)findViewById(R.id.drugRehabLink);
      //  textView.setClickable(true);
       // textView.setMovementMethod(LinkMovementMethod.getInstance());
     //   String text = "<a href='http://www.google.com'> Google </a>";
     //   textView.setText(Html.fromHtml(text));
        setContentView(R.layout.activity_locations_page);

    }

}
