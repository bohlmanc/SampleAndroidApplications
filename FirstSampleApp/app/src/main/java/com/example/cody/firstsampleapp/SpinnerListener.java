package com.example.cody.firstsampleapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

// Spinner to be used with this Sample App.
// Written by Cody Bohlman
// April 9, 2015

public class SpinnerListener implements AdapterView.OnItemSelectedListener {


    public static String spinnerString;

    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
        spinnerString = parent.getItemAtPosition(pos).toString();
        Toast.makeText(parent.getContext(),
                "Current selection: " + spinnerString,
                Toast.LENGTH_SHORT).show();
        MainActivity.setSpinnerString(getSpinnerString());
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public String getSpinnerString() {
        return spinnerString;
    }
}