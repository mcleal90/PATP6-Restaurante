package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                Intent voltar = new Intent(getApplicationContext(),Menu.class);
                startActivity(voltar);
            }
        });
//botao finalizar após o pagamento do cliente a comanda retorna para o estado de espera
        btCaixaFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FinalizarComanda();
            }
        });
    }

    private void FinalizarComanda() {
        FuncaoMostraCaixaTexto msg = new FuncaoMostraCaixaTexto("Comanda finalizada!","Sucesso!",Caixa.this);
    }
}