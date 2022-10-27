package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Comandas extends AppCompatActivity {
    EditText edComandas,EdItemCardapio,edQuantidade;
    Button btAdicionarPedido,btComandasVoltar,btComandasVer,btFecharPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comandas);

        btComandasVoltar = findViewById(R.id.btComandasVoltar);
        btComandasVer = findViewById(R.id.btComandasVer);

//botao voltar para o menu
        btComandasVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}