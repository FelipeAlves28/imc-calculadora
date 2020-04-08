package com.example.telainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Adicao extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    TextView edR;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Adição");

        setContentView(R.layout.activity_adicao);
        ed1 =(EditText)findViewById(R.id.editTextValor1Adicao);
        ed2 = (EditText)findViewById(R.id.editTextValor2Adicao);
        edR =(TextView) findViewById(R.id.textViewResultadoAdicao);
        buttonCalcular = (Button) findViewById(R.id.buttonCalcularAdicao);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valor1;
                Double valor2;
                Double result;

                valor1 = Double.parseDouble(ed1.getText().toString());
                valor2 = Double.parseDouble(ed2.getText().toString());
                result = valor1 + valor2;
                edR.setText(result.toString());
            }
        });
    }
}
