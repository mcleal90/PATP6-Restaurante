package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Caixa extends AppCompatActivity {
    Button btCaixaVoltar,btCaixaFinalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caixa);

        btCaixaVoltar = findViewById(R.id.btCaixaVoltar);
        btCaixaFinalizar = findViewById(R.id.btCaixaFinalizar);
//botao voltar para o menu
        btCaixaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}