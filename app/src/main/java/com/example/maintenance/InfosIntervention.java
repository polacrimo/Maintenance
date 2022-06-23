package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfosIntervention extends AppCompatActivity {

    TextView numeroText,
            dateIntervText,
            panneText,
            dureeText,
            responsableText,
            descriptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_intervention);

        numeroText = (TextView) findViewById(R.id.numero);
        dateIntervText = (TextView) findViewById(R.id.dateInterv);
        panneText = (TextView) findViewById(R.id.panne);
        dureeText = (TextView) findViewById(R.id.duree);
        responsableText = (TextView) findViewById(R.id.responsable);
        descriptionText = (TextView) findViewById(R.id.description);

        //Intervention newIntervention = (Intervention) getIntent().getSerializableExtra("");

        //numeroText.setText(newIntervention.getNumero());
        //dateIntervText.setText(newIntervention.getDateInterv());
        //panneText.setText(newIntervention.getPanne());
        //dureeText.setText(newIntervention.getDuree());
        //responsableText.setText(newIntervention.getResponsable());
        //descriptionText.setText(newIntervention.getDescription());
    }
}