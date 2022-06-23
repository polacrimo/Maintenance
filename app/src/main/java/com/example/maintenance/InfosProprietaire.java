package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfosProprietaire extends AppCompatActivity {

    TextView nomText,
            prenomText,
            adresseText,
            mailText,
            telephoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_proprietaire);

        nomText = (TextView) findViewById(R.id.nom);
        prenomText = (TextView) findViewById(R.id.prenom);
        adresseText = (TextView) findViewById(R.id.adresse);
        mailText = (TextView) findViewById(R.id.mail);
        telephoneText = (TextView) findViewById(R.id.telephone);

        //Proprietaire newProprietaire = (Proprietaire) getIntent().getSerializableExtra("");

        //nomText.setText(newProprietaire.getNom());
        //prenomText.setText(newProprietaire.getPrenom());
        //adresseText.setText(newProprietaire.getAdresse());
        //mailText.setText(newProprietaire.getMail());
        //telephoneText.setText(newProprietaire.getTelephone());
    }
}