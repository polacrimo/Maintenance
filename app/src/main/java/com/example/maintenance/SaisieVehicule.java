package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaisieVehicule extends AppCompatActivity {
    TextView view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_vehicule);
        //view1 = (TextView) findViewById(R.id.view1);
        //view1.setText("Hello");
    }
}