package com.example.patp6_restaurante;

import androidx.appcompat.app.AppCompatActivity;

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
//indentifica elementos
        edUser = findViewById(R.id.edUser);
        edSenha = findViewById(R.id.edSenha);
        btLogin = findViewById(R.id.btLogin);
//cria o banco de dados
        criarBancoDados();
//botao logar - abrir menu mas falta verificar autenticação
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                setContentView(R.layout.activity_menu);
                Intent logarmenu = new Intent(getApplicationContext(),Menu.class);
                startActivity(logarmenu);
            }
        });

    }

    private void criarBancoDados() {
        try {
            bancoDados = openOrCreateDatabase("bdRestaurante",MODE_PRIVATE,null);
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS comanda(numero INTEGER PRIMARY KEY, situacao INTEGER)");
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pedido(idpedido INTEGER PRIMARY KEY AUTOINCREMENT, numero_com INTEGER, mesa INTEGER, cliente VARCHAR, telefone VARCHAR)");
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS cardapio(idcardapio INTEGER PRIMARY KEY AUTOINCREMENT, descricao VARCHAR, valor VARCHAR)");
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pedido_item(idpedido_item INTEGER PRIMARY KEY AUTOINCREMENT, idpedido INTEGER, idcardapio INTEGER, quantidade INTEGER )");
            bancoDados.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}