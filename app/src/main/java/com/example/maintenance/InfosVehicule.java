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

        Vehicule vehiculeSaisi = (Vehicule) getIntent().getSerializableExtra("vehicule");

        matriculeText = (TextView) findViewById(R.id.matricule);
        marqueText = (TextView) findViewById(R.id.marque);
        modeleText = (TextView) findViewById(R.id.modele);
        couleurText = (TextView) findViewById(R.id.couleur);
        puissanceText = (TextView) findViewById(R.id.puissance);
        categorieText = (TextView) findViewById(R.id.categorie);
        boiteVitesseText = (TextView) findViewById(R.id.boiteVitesse);
        anneeText = (TextView) findViewById(R.id.annee);

        matriculeText.setText(vehiculeSaisi.getImmat());
        marqueText.setText(vehiculeSaisi.getMarque());
        modeleText.setText(vehiculeSaisi.getModele());
        puissanceText.setText(vehiculeSaisi.getPuissance());
        categorieText.setText(vehiculeSaisi.getCategorie());
        boiteVitesseText.setText(vehiculeSaisi.getCouleur());
        anneeText.setText(vehiculeSaisi.getAnnee());

        //com.example.maintenance.SaisieVehicule.Vehicule newVehicule = (com.example.maintenance.SaisieVehicule.Vehicule) getIntent().getSerializableExtra("");

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