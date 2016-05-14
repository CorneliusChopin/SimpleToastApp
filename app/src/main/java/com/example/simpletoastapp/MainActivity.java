package com.example.simpletoastapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText userName;
    private Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText)findViewById(R.id.userNameID);
        submitButton = (Button) findViewById(R.id.submitButtonID);
        submitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String nameEntered = userName.getText().toString();
        if (nameEntered.length() == 0){
            Toast toast = Toast.makeText(this, getString(R.string.name_missing), Toast.LENGTH_SHORT);
            toast.show();
        }else
        {
            Toast.makeText(this, getString(R.string.name_entered, nameEntered), Toast.LENGTH_SHORT).show();
        }
    }
}