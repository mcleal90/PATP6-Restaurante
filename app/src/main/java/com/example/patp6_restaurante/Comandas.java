package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Comandas extends AppCompatActivity {
    Button btComandasVoltar,btComandasSalvar;
//    List<String> listaPedidos;
//    ArrayAdapter<String> arrayPedidos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comandas);

//        listaPedidos = new ArrayList<>();
//        arrayPedidos = new ArrayAdapter<>(this,);

        btComandasVoltar = findViewById(R.id.btComandasVoltar);
        btComandasSalvar = findViewById(R.id.btComandasSalvar);
//botao voltar para o menu
        btComandasVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}