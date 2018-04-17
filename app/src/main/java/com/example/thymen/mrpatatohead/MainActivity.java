package com.example.thymen.mrpatatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // checkbox function to determine which elements to show
    public void checkClicked(View v) {

        CheckBox checkbox = ((CheckBox) v);
        // determine which checkbox was checked
        switch (v.getId()) {
            case R.id.checkArms:
                ImageView arms = findViewById(R.id.arms);
                if (checkbox.isChecked())
                    arms.setVisibility(View.VISIBLE);
                else
                    arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkEars:
                ImageView ears = findViewById(R.id.ears);
                if (checkbox.isChecked())
                    ears.setVisibility(View.VISIBLE);
                else
                    ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkEyes:
                ImageView eyes = findViewById(R.id.eyes);
                if (checkbox.isChecked())
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkEyebrows:
                ImageView eyebrows = findViewById(R.id.eyebrows);
                if (checkbox.isChecked())
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkGlasses:
                ImageView glasses = findViewById(R.id.glasses);
                if (checkbox.isChecked())
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkHat:
                ImageView hat = findViewById(R.id.hat);
                if (checkbox.isChecked())
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkMouth:
                ImageView mouth = findViewById(R.id.mouth);
                if (checkbox.isChecked())
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkMustache:
                ImageView mustache = findViewById(R.id.mustache);
                if (checkbox.isChecked())
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkNose:
                ImageView nose = findViewById(R.id.nose);
                if (checkbox.isChecked())
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkShoes:
                ImageView shoes = findViewById(R.id.shoes);
                if (checkbox.isChecked())
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
                break;
        }
    }
}