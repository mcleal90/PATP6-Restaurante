//package com.example.patp6_restaurante;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import androidx.annotation.Nullable;
//
//public class DBHelper extends SQLiteOpenHelper {
//
//    public DBHelper(Context context) {
//        super(context, "bdRestaurante.db", null, 1);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase DB) {
//        try {
//            DB.execSQL("CREATE TABLE IF NOT EXISTS login(idlogin INTEGER PRIMARY KEY AUTOINCREMENT, user VARCHAR, senha VARCHAR)");
//            DB.execSQL("CREATE TABLE IF NOT EXISTS comanda(numero INTEGER PRIMARY KEY, situacao INTEGER)");
//            DB.execSQL("CREATE TABLE IF NOT EXISTS pedido(idpedido INTEGER PRIMARY KEY AUTOINCREMENT, numero_com INTEGER, mesa INTEGER, cliente VARCHAR, telefone VARCHAR)");
//            DB.execSQL("CREATE TABLE IF NOT EXISTS cardapio(idcardapio INTEGER PRIMARY KEY AUTOINCREMENT, descricao VARCHAR, valor VARCHAR)");
//            DB.execSQL("INSERT OR REPLACE INTO login (user, senha) VALUES ('admin', 'admin')");
//            DB.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
//        DB.execSQL("DROP TABLE IF EXISTS bdRestaurante");
//    }
//
//    public Boolean insertPedido(int numero_com, int mesa, String cliente, String telefone) {
//        SQLiteDatabase DB = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("numero_com", numero_com);
//        contentValues.put("mesa", mesa);
//        contentValues.put("cliente", cliente);
//        contentValues.put("telefone", telefone);
//    }
//}
