package com.example.apptemdetudo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    EditText edtNome; // Declara aqui

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtNome = findViewById(R.id.edtNome); // Liga com o XML
    }

    public void enviarCadastro(View view) {
        String nome = edtNome.getText().toString();

        if (nome.isEmpty()) {
            Toast.makeText(this, "Por favor, insira seu nome", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, ConfirmacaoActivity.class);
            intent.putExtra("nome_cliente", nome);
            startActivity(intent);
        }
    }
}