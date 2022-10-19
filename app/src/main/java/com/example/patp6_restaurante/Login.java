package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
        EditText edUser, edSenha;
        Button btLogin;
        private SQLiteDatabase bancoDados;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

//identifica elementos
            edUser = findViewById(R.id.edUser);
            edSenha = findViewById(R.id.edSenha);
            btLogin = findViewById(R.id.btLogin);

//funcao criar o banco de dados
            criarBancoDados();

//clique botao logar - abrir menu mas falta verificar autenticação
            btLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent logarmenu = new Intent(getApplicationContext(),CadastrarComanda.class);
                    startActivity(logarmenu);
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

    private void criarBancoDados() {
            try {
                bancoDados = openOrCreateDatabase("bdRestaurante",MODE_PRIVATE,null);
                bancoDados.execSQL("CREATE TABLE IF NOT EXISTS login(idlogin INTEGER PRIMARY KEY AUTOINCREMENT, user VARCHAR, senha VARCHAR)");
                bancoDados.execSQL("CREATE TABLE IF NOT EXISTS comanda(numero INTEGER PRIMARY KEY, situacao INTEGER)");
                bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pedido(idpedido INTEGER PRIMARY KEY AUTOINCREMENT, numero_com INTEGER, mesa INTEGER, cliente VARCHAR, telefone VARCHAR)");
                bancoDados.execSQL("CREATE TABLE IF NOT EXISTS cardapio(idcardapio INTEGER PRIMARY KEY AUTOINCREMENT, descricao VARCHAR, valor VARCHAR)");
                bancoDados.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }