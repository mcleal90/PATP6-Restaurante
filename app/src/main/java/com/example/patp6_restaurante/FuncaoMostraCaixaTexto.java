package com.example.patp6_restaurante;

import android.app.AlertDialog;
import android.content.Context;

public class FuncaoMostraCaixaTexto {

    //funcao caixa de texto
    public FuncaoMostraCaixaTexto (String msg, String titulo, Context context) {
//Gera uma caixa de texto na tela com um botão "OK"
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(msg);
        builder.setNeutralButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.setTitle(titulo);
        dialog.show();
    }
}
