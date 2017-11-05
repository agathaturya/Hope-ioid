package com.example.myveryfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myveryfirstapp.MESSAGE";
    public static String USER_NAME;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //send button for name
    public void sendMessage(View view){
        Intent intent = new Intent(this, FirstNavigationPage.class);
        EditText editText=(EditText)findViewById(R.id.editName);
        String message= editText.getText().toString();
        this.USER_NAME=message;
        intent.putExtra(EXTRA_MESSAGE, USER_NAME);
        startActivity(intent);
    }

}
