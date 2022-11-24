package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminComandas extends AppCompatActivity {
    Button btComandasVoltarAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_comandas);

        btComandasVoltarAdmin = findViewById(R.id.btComandasVoltarAdmin);

        btComandasVoltarAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),Administrador.class);
                startActivity(voltar);
            }
        });
    }
}