package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastrarComanda extends AppCompatActivity {
    EditText edComanda,edNomeCliente,edTelefoneCliente,edMesa;
    Button btCadComandaVoltar,btCadComandaSalvar;
    SQLiteDatabase bancoDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_comanda);

//identificacao de elementos
        edComanda = findViewById(R.id.edComanda);
        edNomeCliente = findViewById(R.id.edNomeCliente);
        edTelefoneCliente = findViewById(R.id.edTelefoneCliente);
        edMesa = findViewById(R.id.edMesa);
        btCadComandaSalvar=findViewById(R.id.btCadComandaSalvar);
        btCadComandaVoltar=findViewById(R.id.btCadComandaVoltar);
//Banco de dados
        bancoDados = openOrCreateDatabase("bdRestaurante",MODE_PRIVATE,null);
//botao voltar para o menu
        btCadComandaVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
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

    //funcao caixa de texto
    private void mostraCxTexto(String msg, String titulo) {
//Gera uma caixa de texto na tela com um bot�o
        //"OK"
        AlertDialog.Builder builder = new
                AlertDialog.Builder(this);
        builder.setMessage(msg);
        builder.setNeutralButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.setTitle(titulo);
        dialog.show();
    }

    private void SalvaComanda() {
        //Salva cadastro da comanda
        try {
            bancoDados.execSQL("INSERT INTO pedido(numero_com," +
                    "cliente," +
                    "telefone," +
                    "mesa) " +
                    "VALUES ('"+
                    edComanda.getText().toString() + "','" +
                    edNomeCliente.getText().toString() + "','" +
                    edTelefoneCliente.getText().toString() + "','" +
                    edMesa.getText().toString() + "')");

            btCadComandaSalvar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent abrircomandas = new Intent(getApplicationContext(),Comandas.class);
                    startActivity(abrircomandas);
                }
            });
        } catch (Exception e) {
            mostraCxTexto("Inserindo BD. Mensagem: " +
                    e.getMessage(), "ERRO");
        }
    }
}