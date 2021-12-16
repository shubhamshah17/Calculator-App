package com.shubham.calculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.shubham.calculatorapp.units.UnitArea;
import com.shubham.calculatorapp.units.UnitLength;
import com.shubham.calculatorapp.units.UnitTemperature;
import com.shubham.calculatorapp.units.UnitWeight;

public class UnitCoverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_coverter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onClick(View v)
    {
        Intent i;
        switch(v.getId())
        {
            case R.id.area:
                i=new Intent(this, UnitArea.class);
                startActivity(i);
                break;
            case R.id.length:
                i=new Intent(this, UnitLength.class);
                startActivity(i);
                break;
            case R.id.weight:
                i=new Intent(this, UnitWeight.class);
                startActivity(i);
                break;
            case R.id.tempearture:
                i=new Intent(this, UnitTemperature.class);
                startActivity(i);
                break;
        }
    }

}
