package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class authentication extends AppCompatActivity {

    EditText mlogin_input;
    EditText mpassword_input;
    Button mconnectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        EditText mlogin_input = (EditText)findViewById(R.id.login_input);
        EditText mpassword_input = (EditText)findViewById(R.id.password_input);
        Button mconnectButton = (Button)findViewById(R.id.connectButton);

        mconnectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String login = mlogin_input.getText().toString();
                String password = mpassword_input.getText().toString();

                if (login == "root" && password == "root"){
                    Intent intent = new Intent(authentication.this, menu.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Erreur d'authentification", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}