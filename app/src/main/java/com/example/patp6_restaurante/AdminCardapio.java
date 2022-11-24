package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminCardapio extends AppCompatActivity {
    Button btCardapioSalvarAdmin,btCardapioVoltarAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_cardapio);

        btCardapioSalvarAdmin = findViewById(R.id.btCardapioSalvarAdmin);
        btCardapioVoltarAdmin = findViewById(R.id.btCardapioVoltarAdmin);

        btCardapioSalvarAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvarCardapioAdmin();
            }
        });

        btCardapioVoltarAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(), Administrador.class);
                startActivity(voltar);
            }
        });
    }

    private void salvarCardapioAdmin() {
        FuncaoMostraCaixaTexto msg = new FuncaoMostraCaixaTexto("Item de cardápio salvo!","Sucesso!",AdminCardapio.this);
    }

}