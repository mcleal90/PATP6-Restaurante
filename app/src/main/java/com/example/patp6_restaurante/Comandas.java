package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Comandas extends AppCompatActivity {
    Button btAdicionarPedido, btVoltarCom,btComandasVer,btNovaComanda, btFecharComanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comandas);

        btAdicionarPedido = findViewById(R.id.btAdicionarPedido);
        btVoltarCom = findViewById(R.id.btVoltarCom);
        btComandasVer = findViewById(R.id.btComandasVer);
        btFecharComanda = findViewById(R.id.btFecharComanda);
        btNovaComanda = findViewById(R.id.btNovaComanda);

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

//botao voltar
        btVoltarCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),Menu.class);
                startActivity(voltar);
            }
        });

//botao fechar pedido
    btFecharComanda.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            fecharComanda();
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
    private void fecharComanda() {
        //altera a situação da comanda (1=livre,2=uso,3=fechada)
        FuncaoMostraCaixaTexto msg = new FuncaoMostraCaixaTexto("Comanda fechada!","Sucesso!",Comandas.this);
    }

    private void adicionarPedido() {
        FuncaoMostraCaixaTexto msg = new FuncaoMostraCaixaTexto("Pedido adicionado!","Sucesso!",Comandas.this);
    }
        
    }