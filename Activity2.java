package com.example.a16kongs1.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;


public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customwatermenutrue);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
    }

    public void genderCheckBox(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox2: //male
                if (checked) {
                    final TextView textView17 = (TextView) findViewById(R.id.textView17);
                    textView17.setText(R.string.finalwaterintake9);
                    final TextView textView10 = (TextView) findViewById(R.id.textView10);
                    textView10.setText(R.string.fwi9);
                    int dailywaterintake = 2200;
                    boolean genderMale = true;
                } else {
                    final TextView textView17 = (TextView) findViewById(R.id.textView17);
                    textView17.setText(R.string.finalwaterintake); //2000
                    final TextView textView10 = (TextView) findViewById(R.id.textView10);
                    textView10.setText(R.string.fwi);
                    int dailywaterintake = 2000;
                    boolean genderMale = false;
                }

                break;

            case R.id.checkBox3: // female
                if (checked) {
                    final TextView textView17 = (TextView) findViewById(R.id.textView17);
                    textView17.setText(R.string.finalwaterintake5); //1800
                    final TextView textView10 = (TextView) findViewById(R.id.textView10);
                    textView10.setText(R.string.fwi5);
                    int dailywaterintake = 1800;
                    boolean genderFemale = true;
                } else {
                    final TextView textView17 = (TextView) findViewById(R.id.textView17);
                    textView17.setText(R.string.finalwaterintake); //2000
                    final TextView textView10 = (TextView) findViewById(R.id.textView10);
                    textView10.setText(R.string.fwi);
                    int dailywaterintake = 2000;
                    boolean genderFemale = false;
                }

                break;
        }
    }


    public void weightCheckBox(View view, boolean genderMale, boolean genderFemale) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.checkBox11: //<30
                if (checked) {

                    if (!genderMale && !genderFemale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake1);  // no gender 1500
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi1);
                        int dailywaterintake = 1500;
                    }

                    if (genderMale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake8); // male 1650
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi8);
                        int dailywaterintake = 1650;
                    }

                    if (genderFemale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake4); // female 1350
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi4);
                        int dailywaterintake = 1350;
                    }
                }

                break;

            case R.id.checkBox8: //30-60
                if (checked) {

                    if (!genderMale && !genderFemale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake);  // no gender 2000
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi);
                        int dailywaterintake = 2000;
                    }

                    if (genderMale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake9); // male 2200
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi9);
                        int dailywaterintake = 2200;
                    }

                    if (genderFemale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake5); // female 1800
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi5);
                        int dailywaterintake = 1800;
                    }
                }
                break;

            case R.id.checkBox9: //60-90
                if (checked) {
                    if (!genderMale && !genderFemale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake2);  // no gender 2500
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi2);
                        int dailywaterintake = 2500;
                    }

                    if (genderMale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake10); // male 2750
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi10);
                        int dailywaterintake = 2750;
                    }

                    if (genderFemale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake6); // female 2250
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi6);
                        int dailywaterintake = 2250;
                    }
                }
                break;

            case R.id.checkBox10: //>90
                if (checked) {
                    if (!genderMale && !genderFemale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake3);  // no gender 3000
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi3);
                        int dailywaterintake = 3000;
                    }

                    if (genderMale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake11); // male 3300
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi11);
                        int dailywaterintake = 3300;
                    }

                    if (genderFemale) {
                        final TextView textView17 = (TextView) findViewById(R.id.textView17);
                        textView17.setText(R.string.finalwaterintake7);// female 2700
                        final TextView textView10 = (TextView) findViewById(R.id.textView10);
                        textView10.setText(R.string.fwi7);
                        int dailywaterintake = 2700;
                    }
                }
                break;

        }
    }

    public void customSetWater (View view) {

        EditText customSetWaterEditText = (EditText) findViewById(R.id.editText1);
        String customWaterIntake = customSetWaterEditText.getText().toString();
        int dailywaterintake = Integer.parseInt(customSetWaterEditText.getText().toString()); //convert int to string
        final TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setText(R.string.fwicustom1 + customWaterIntake + R.string.fwicustom2); // your water intake is x ml
        final TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setText(dailywaterintake);

        // keep click to type water intake...?//
    }

    public void SwitchScreen2(View v) {
        Button button = (Button) v;
        startActivity(new Intent(Activity2.this, MainActivity.class));

        if (int dailywaterintake = 2000) { // if waterintake doesnt change
            ((Button) v).setText(R.string.button);
        }

        else {
            ((Button) v).setText(R.string.ON);
        }
    }
}


