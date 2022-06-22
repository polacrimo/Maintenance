package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    Button retourBtn;
    Button sVehiculeBtn;
    Button sInterventionBtn;
    Button sProtrietaireBtn;
    Button lVehiculeBtn;
    Button lInterventionBtn;
    Button lProtrietaireBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        retourBtn = (Button) findViewById(R.id.retour);
        sVehiculeBtn = (Button) findViewById(R.id.saisieV);
        sInterventionBtn = (Button) findViewById(R.id.saisieI);
        sProtrietaireBtn = (Button) findViewById(R.id.saisieP);
        lVehiculeBtn = (Button) findViewById(R.id.listeV);
        lInterventionBtn = (Button) findViewById(R.id.listeI);
        lProtrietaireBtn = (Button) findViewById(R.id.listeP);

        retourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        sVehiculeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, SaisieVehicule.class);
                startActivity(intent);
            }
        });

        sInterventionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, SaisieIntervention.class);
                startActivity(intent);
            }
        });

        sProtrietaireBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, SaisieProprietaire.class);
                startActivity(intent);
            }
        });

        lVehiculeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ListeVehicule.class);
                startActivity(intent);
            }
        });

        lInterventionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ListeIntervention.class);
                startActivity(intent);
            }
        });

        lProtrietaireBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ListeProprietaire.class);
                startActivity(intent);
            }
        });
    }
}