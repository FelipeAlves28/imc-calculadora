package com.example.telainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculadora extends AppCompatActivity {

    Button btnAdicao;
    Button btnSubtracao;
    Button btnMultiplicacao;
    Button btnDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        setTitle("Calculadora");

        btnAdicao = (Button)findViewById(R.id.buttonAdicao);
        btnMultiplicacao = (Button)findViewById(R.id.buttonMultiplicacao);
        btnDivisao = (Button)findViewById(R.id.buttonDivisao);
        btnSubtracao = (Button)findViewById(R.id.buttonSubtracao);

        abrirAdicao();
        abrirSubtracao();
        abrirDivisao();
        abrirMultiplicacao();
    }


    protected void abrirAdicao(){

            btnAdicao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent acaoAbrirTela = new Intent(getApplicationContext(),Adicao.class);
                    startActivity(acaoAbrirTela);
                }
            });
        }

    protected  void  abrirSubtracao(){
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acaoAbrirTela = new Intent(getApplicationContext(),Subtracao.class);
                startActivity(acaoAbrirTela);
            }
        });
    }

    protected  void  abrirDivisao(){
        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acaoAbrirTela = new Intent(getApplicationContext(),Divisao.class);
                startActivity(acaoAbrirTela);
            }
        });
    }

    protected  void abrirMultiplicacao(){
        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acaoAbrirTela = new Intent(getApplicationContext(),Multiplicao.class);
                startActivity(acaoAbrirTela);
            }
        });
    }


}
