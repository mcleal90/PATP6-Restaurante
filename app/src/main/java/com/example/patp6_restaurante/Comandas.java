package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Comandas extends AppCompatActivity {
    EditText edItemCardapio,edQuantidade;
    Spinner edComandas;
    Button btAdicionarPedido, btNovaComanda,btComandasVer,btFecharPedido;
    private SQLiteDatabase bancoDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comandas);


        btNovaComanda = findViewById(R.id.btNovaComanda);
        btComandasVer = findViewById(R.id.btComandasVer);
        btFecharPedido = findViewById(R.id.btFecharPedido);


//botao adicionar pedido
        btAdicionarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarPedido();
            }
        });

//botao nova comanda
        btNovaComanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nova = new Intent(getApplicationContext(),CadastrarComanda.class);
                startActivity(nova);
            }
        });

//botao fechar pedido
    btFecharPedido.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            fecharPedido();
        }
    });

//botao ver pedidos da comanda
    btComandasVer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent ver = new Intent(getApplicationContext(),Pedidos.class);
            startActivity(ver);
        }
    });
    }

//funções
    private void fecharPedido() {
        //altera a situação da comanda (1=livre,2=uso,3=fechada)
    }

    private void adicionarPedido() {
        FuncaoMostraCaixaTexto msg = new FuncaoMostraCaixaTexto("Pedido adicionado!","Sucesso!",Comandas.this);
    }
        
    }