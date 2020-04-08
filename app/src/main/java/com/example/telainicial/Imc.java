package com.example.telainicial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Imc extends AppCompatActivity {

    EditText peso;
    EditText altura;
    TextView resultado;
    Button calcularImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        setTitle("IMC");

        peso = (EditText)findViewById(R.id.editTextPeso);
        altura = (EditText)findViewById(R.id.editTextAltura);
        resultado = (TextView) findViewById(R.id.textViewResultadoImc);
        calcularImc = (Button)findViewById(R.id.buttonCalcularImc);

        calcularImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double pesoCalcular;
                Double alturaCalcular;
                Double result;

                pesoCalcular = Double.parseDouble(peso.getText().toString());
                alturaCalcular = Double.parseDouble(altura.getText().toString());
                result = pesoCalcular/(alturaCalcular * alturaCalcular);
                resultado.setText(result.toString());
            }
        });

    }
}
