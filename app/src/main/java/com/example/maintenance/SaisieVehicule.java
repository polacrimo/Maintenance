package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

public class SaisieVehicule extends AppCompatActivity {
    EditText m_Immat;
    EditText m_Marque;
    EditText m_Modele;
    EditText m_Couleur;
    EditText m_Puissance;
    EditText m_Categorie;
    EditText m_BoiteVitesse;
    EditText m_Annee;
    Button m_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_vehicule);
        m_Immat = (EditText)findViewById(R.id.editImmat);
        m_Marque = (EditText)findViewById(R.id.editMarque);
        m_Modele = (EditText)findViewById(R.id.editModele);
        m_Couleur = (EditText)findViewById(R.id.editCouleur);
        m_Puissance = (EditText)findViewById(R.id.editPuissance);
        m_Categorie = (EditText)findViewById(R.id.editPuissance);
        m_BoiteVitesse = (EditText)findViewById(R.id.editBoiteVitesse);
        m_Annee = (EditText)findViewById(R.id.editAnnee);
        m_submit = (Button)findViewById(R.id.submitBtn);

        m_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String immat = m_Immat.getText().toString();
                String marque = m_Marque.getText().toString();
                String modele = m_Modele.getText().toString();
                String couleur = m_Couleur.getText().toString();
                int puissance = Integer.parseInt(m_Puissance.getText().toString());
                String categorie = m_Categorie.getText().toString();
                String boiteVitesse = m_BoiteVitesse.getText().toString();
                int annee = Integer.parseInt(m_Annee.getText().toString());

                if (immat.equals(null) || marque.equals(null) || modele.equals(null) || couleur.equals(null) || puissance <= 0 || categorie.equals(null) || boiteVitesse.equals(null) || annee <= 0){
                    Toast.makeText(getApplicationContext(), "Please fill in all fields", Toast.LENGTH_LONG).show();
                } else {
                    Vehicule vehiculeSaisi = new Vehicule(immat, marque, modele, couleur, puissance, categorie, boiteVitesse, annee);
                    Intent intent = new Intent(SaisieVehicule.this, Menu.class);
                    intent.putExtra("vehicule", vehiculeSaisi);
                    startActivity(intent);
                }
            }
        });
    }
}