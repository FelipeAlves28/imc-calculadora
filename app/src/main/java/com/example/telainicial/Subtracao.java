package com.example.telainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Subtracao extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    TextView edR;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtracao);
        setTitle("Subtração");

        ed1 =(EditText)findViewById(R.id.editTextValor1Subtracao);
        ed2 = (EditText)findViewById(R.id.editTextValor2Subtracao);
        edR =(TextView) findViewById(R.id.textViewResultadoSubtracao);
        buttonCalcular = (Button) findViewById(R.id.buttonCalcularSubtracao);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valor1;
                Double valor2;
                Double result;

                valor1 = Double.parseDouble(ed1.getText().toString());
                valor2 = Double.parseDouble(ed2.getText().toString());
                result = valor1 - valor2;
                edR.setText(result.toString());
            }
        });
    }
}
