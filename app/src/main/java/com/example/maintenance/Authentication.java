package com.example.maintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Authentication extends AppCompatActivity {

    EditText mlogin_input;
    EditText mpassword_input;
    Button mconnectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        mlogin_input = (EditText)findViewById(R.id.login_input);
        mpassword_input = (EditText)findViewById(R.id.password_input);
        mconnectButton = (Button)findViewById(R.id.connectButton);

        mconnectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String login = mlogin_input.getText().toString();
                String password = mpassword_input.getText().toString();

                if (login.equals("root") && password.equals("root")){
                    Intent intent = new Intent(Authentication.this, Menu.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Authentication error", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}