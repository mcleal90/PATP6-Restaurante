package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText edUser, edSenha;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edUser = findViewById(R.id.edUser);
        edSenha = findViewById(R.id.edSenha);
        btLogin = findViewById(R.id.btLogin);
//botao logar - abrir menu mas falta verificar autenticação
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setContentView(R.layout.activity_menu);
                Intent logarmenu = new Intent(getApplicationContext(),Menu.class);
                startActivity(logarmenu);
            }
        });

    }
}