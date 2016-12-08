package com.example.a16kongs1.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
    }

    public void SwitchScreen(View v)
    {
        Button button = (Button) v;
        startActivity(new Intent(MainActivity.this, Activity2.class));
    }

    public void TriggerLED(View v)
    {
        Button button = (Button) v;
        if (R.id.LEDButton = R.string.button) {

        }
        ((Button) v).setText(R.string.ON);
        // if button = on, turn off, if button = off, turn on
    }

    public void customsetReminder (View v)
    {
        EditText customSetWaterEditText = (EditText) findViewById(R.id.editText2);
        int customMinsSet = Integer.parseInt(customSetWaterEditText.getText().toString()); // user sets mins before led reminder, reuse later?
        final TextView editText2 = (TextView) findViewById(R.id.editText2); // set textview in settings screen to user change
        editText2.setText(customMinsSet);
    }

}

