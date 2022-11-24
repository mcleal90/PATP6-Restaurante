package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminLogin extends AppCompatActivity {
    Button btLoginVoltarAdmin, btLoginSalvarAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        btLoginSalvarAdmin = findViewById(R.id.btCardapioSalvarAdmin);
        btLoginVoltarAdmin = findViewById(R.id.btCardapioVoltarAdmin);

        btLoginSalvarAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarLoginAdmin();
            }
        });

        btLoginVoltarAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(), Administrador.class);
                startActivity(voltar);
            }
        });
    }

    private void salvarLoginAdmin() {
        FuncaoMostraCaixaTexto msg = new FuncaoMostraCaixaTexto("Login salvo!","Sucesso!",AdminLogin.this);
    }
}