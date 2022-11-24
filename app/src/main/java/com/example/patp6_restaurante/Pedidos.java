package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pedidos extends AppCompatActivity {
    Button btVoltarPed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);

        btVoltarPed = findViewById(R.id.btComandasVoltarAdmin);

        btVoltarPed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),Comandas.class);
                startActivity(voltar);
            }
        });
    }
}