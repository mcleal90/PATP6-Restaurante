package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Administrador extends AppCompatActivity {
    Button btNovoLogin,btNovoCardapio,btVerificarComandas,btAdminSair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);
//identificacao de elementos
        btNovoLogin = findViewById(R.id.btNovoLogin);
        btNovoCardapio = findViewById(R.id.btNovoCardapio);
        btVerificarComandas = findViewById(R.id.btVerificarComandas);
        btAdminSair = findViewById(R.id.btAdminSair);

//botao novo login
        btNovoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(getApplicationContext(),AdminLogin.class);
                startActivity(login);
            }
        });
//botao novo cardapio
        btNovoCardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cardapio = new Intent(getApplicationContext(),AdminCardapio.class);
                startActivity(cardapio);
            }
        });

//botao verificar comandas
        btVerificarComandas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comandas = new Intent(getApplicationContext(),AdminComandas.class);
                startActivity(comandas);
            }
        });

//botao voltar para o menu
        btAdminSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),Menu.class);
                startActivity(voltar);
            }
        });
    }
}