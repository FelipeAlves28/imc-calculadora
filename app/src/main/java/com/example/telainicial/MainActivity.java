package com.example.telainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnImc;
    private Button btnCalcularadora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calcular");
        btnImc = (Button) findViewById(R.id.btnIMC);
        btnCalcularadora = (Button) findViewById(R.id.btnCalculadora);
        abrirImc();
        abrirCalculadora();

    }

    protected void abrirImc(){

        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acaoDeAbrirTela = new Intent(getApplicationContext(),Imc.class);
                startActivity(acaoDeAbrirTela);
            }
        });
    }

    protected void abrirCalculadora(){
        btnCalcularadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acaoDeAbrirTela = new Intent(getApplicationContext(), Calculadora.class);
                startActivity(acaoDeAbrirTela);

            }
        });
    }
}
