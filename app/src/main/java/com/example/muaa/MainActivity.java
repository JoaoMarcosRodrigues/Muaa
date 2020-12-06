package com.example.muaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titulo;
    ImageButton ouvir;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = findViewById(R.id.txt_titulo);
        ouvir = findViewById(R.id.btn_ouvir);
        progressBar = findViewById(R.id.progress_bar);

        ouvir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                titulo.setText("Ouvindo...");
                // Trocar a imagem por outra
            }
        });
    }
}