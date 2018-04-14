package com.example.thymen.mrpatatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    public ImageView body, arms, ears, eyes, eyebrows, glasses, hat, mouth, mustache, nose, shoes;
    public CheckBox checkArms, checkEars, checkEyes, checkEyebrows, checkGlasses, checkHat, checkMouth, checkMustache, checkNose, checkShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // checkbox function to determine which elements to show
    public void checkClicked(View v) {

        CheckBox checkbox = (CheckBox) v;
        // determine which checkbox was checked
        switch (v.getId()) {
            case R.id.checkArms:
                if (checkbox.isChecked())
                    arms.setVisibility(View.INVISIBLE);
                else
                    arms.setVisibility(View.VISIBLE);
                break;
        }
        switch (v.getId()) {
            case R.id.checkEars:
                if (checkbox.isChecked())
                    ears.setVisibility(View.INVISIBLE);
                else
                    ears.setVisibility(View.VISIBLE);
                break;
        }
        switch (v.getId()) {
            case R.id.checkEyes:
                if (checkbox.isChecked())
                    eyes.setVisibility(View.INVISIBLE);
                else
                    eyes.setVisibility(View.VISIBLE);
                break;
        }
        switch (v.getId()) {
            case R.id.checkEyebrows:
                if (checkbox.isChecked())
                    eyebrows.setVisibility(View.INVISIBLE);
                else
                    eyebrows.setVisibility(View.VISIBLE);
                break;
        }
        switch (v.getId()) {
            case R.id.checkGlasses:
                if (checkbox.isChecked())
                    glasses.setVisibility(View.INVISIBLE);
                else
                    glasses.setVisibility(View.VISIBLE);
                break;
        }
        switch (v.getId()) {
            case R.id.checkHat:
                // show or hide image depending on checkbox state
                if (checkbox.isChecked())
                    hat.setVisibility(View.INVISIBLE);
                else
                    hat.setVisibility(View.VISIBLE);
                break;
        }
        switch (v.getId()) {
            case R.id.checkMouth:
                if (checkbox.isChecked())
                    mouth.setVisibility(View.INVISIBLE);
                else
                    mouth.setVisibility(View.VISIBLE);
                break;
        }
        switch (v.getId()) {
            case R.id.checkMustache:
                if (checkbox.isChecked())
                    mustache.setVisibility(View.INVISIBLE);
                else
                    mustache.setVisibility(View.VISIBLE);
                break;
        }
        switch (v.getId()) {
            case R.id.checkNose:
                if (checkbox.isChecked())
                    nose.setVisibility(View.INVISIBLE);
                else
                    nose.setVisibility(View.VISIBLE);
                break;
        }
        switch (v.getId()) {
            case R.id.checkShoes:
                if (checkbox.isChecked())
                    shoes.setVisibility(View.INVISIBLE);
                else
                    shoes.setVisibility(View.VISIBLE);
                break;
        }
    }
}