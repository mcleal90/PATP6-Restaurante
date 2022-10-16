package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadastrarComanda extends AppCompatActivity {
    Button btCadComandaVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_comanda);
//identificacao de elementos
        btCadComandaVoltar=findViewById(R.id.btCadComandaVoltar);
//botao voltar para o menu
        btCadComandaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}