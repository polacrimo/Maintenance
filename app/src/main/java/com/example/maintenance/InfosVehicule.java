package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfosVehicule extends AppCompatActivity {

    TextView matriculeText,
            marqueText,
            modeleText,
            couleurText,
            puissanceText,
            categorieText,
            boiteVitesseText,
            anneeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_vehicule);

        matriculeText = (TextView) findViewById(R.id.matricule);
        marqueText = (TextView) findViewById(R.id.marque);
        modeleText = (TextView) findViewById(R.id.modele);
        couleurText = (TextView) findViewById(R.id.couleur);
        puissanceText = (TextView) findViewById(R.id.puissance);
        categorieText = (TextView) findViewById(R.id.categorie);
        boiteVitesseText = (TextView) findViewById(R.id.boiteVitesse);
        anneeText = (TextView) findViewById(R.id.annee);

        //Vehicule newVehicule = (Vehicule) getIntent().getSerializableExtra("");

        //matriculeText.setText(newVehicule.getMatricule());
        //marqueText.setText(newVehicule.getMarque());
        //modeleText.setText(newVehicule.getModele());
        //couleurText.setText(newVehicule.getCouleur());
        //puissanceText.setText(newVehicule.getPuissance());
        //categorieText.setText(newVehicule.getCategorie());
        //boiteVitesseText.setText(newVehicule.getBoiteVitesse());
        //anneeText.setText(newVehicule.getAnnee());
    }
}