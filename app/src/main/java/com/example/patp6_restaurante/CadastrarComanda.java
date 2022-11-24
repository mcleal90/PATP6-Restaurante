package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CadastrarComanda extends AppCompatActivity {
    Spinner spiComanda, spiMesa;
    EditText edNomeCliente,edTelefoneCliente;
    Button btCadComandaVoltar,btCadComandaSalvar,btCadComandaCom;
    SQLiteDatabase bancoDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_comanda);

//identificacao de elementos
        spiComanda = findViewById(R.id.spiComanda);
        edNomeCliente = findViewById(R.id.edCardapioAdmin);
        edTelefoneCliente = findViewById(R.id.edSenhaAdmin);
        spiMesa = findViewById(R.id.edValorAdmin);
        btCadComandaSalvar=findViewById(R.id.btCardapioSalvarAdmin);
        btCadComandaVoltar=findViewById(R.id.btCardapioVoltarAdmin);
        btCadComandaCom=findViewById(R.id.btCadComandaCom);
//Banco de dados
        bancoDados = openOrCreateDatabase("bdRestaurante",MODE_PRIVATE,null);
//botao voltar para o menu
        btCadComandaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar = new Intent(getApplicationContext(),Menu.class);
                startActivity(voltar);
            }
        });
        //botao comandas
        btCadComandaCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comandas = new Intent(getApplicationContext(),Comandas.class);
                startActivity(comandas);
            }
        });
//botao salvar
        btCadComandaSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SalvaComanda();
            }
        });
    }

    private void SalvaComanda() {
        //Salva cadastro da comanda
        FuncaoMostraCaixaTexto msg = new FuncaoMostraCaixaTexto ("Comanda salva!", "Sucesso!", this);
    }
}