package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button btCadastrarComanda,btComandas,btCaixa,btAdmin,btMenuSair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btCadastrarComanda = findViewById(R.id.btCadastrarComanda);
        btComandas = findViewById(R.id.btComandas);
        btCaixa = findViewById(R.id.btCaixa);
        btAdmin = findViewById(R.id.btAdmin);
        btMenuSair = findViewById(R.id.btMenuSair);
//botao abrir cadastro de comandas
        btCadastrarComanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrircadcomandas = new Intent(getApplicationContext(),CadastrarComanda.class);
                startActivity(abrircadcomandas);
            }
        });
//botao abrir comandas
        btComandas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrircomandas = new Intent(getApplicationContext(),Comandas.class);
                startActivity(abrircomandas);
            }
        });
//botao abrir caixa
        btCaixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrircaixa = new Intent(getApplicationContext(),Caixa.class);
                startActivity(abrircaixa);
            }
        });
//botao abrir admin
        btAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abriradmin = new Intent(getApplicationContext(),Administrador.class);
                startActivity(abriradmin);
            }
        });
//botao voltar para login - falta encerrar login
        btMenuSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),Login.class);
                startActivity(voltar);
            }
        });
    }
}