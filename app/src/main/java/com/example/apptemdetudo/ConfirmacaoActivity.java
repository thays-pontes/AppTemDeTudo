package com.example.apptemdetudo;

import com.example.apptemdetudo.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmacaoActivity extends AppCompatActivity {

    private TextView txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        txtMensagem = findViewById(R.id.txtMensagem);

        String nome = getIntent().getStringExtra("nomeCliente");
        txtMensagem.setText("Bem-vindo, " + nome + "!");
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
