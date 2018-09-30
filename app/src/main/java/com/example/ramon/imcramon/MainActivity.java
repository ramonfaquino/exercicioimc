package com.example.ramon.imcramon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText editText;
private EditText editText2;
private String pes;
private String alt;
private double altura;
private double peso;
private double imc1;
private double imc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
    }

    public void calc(View view) {
        alt = (editText).getText().toString();
        pes = (editText2).getText().toString();
        altura = Double.valueOf(alt).doubleValue();
        peso = Double.valueOf(pes).doubleValue();

        imc1 = (altura*2);
        imc = altura/imc1;

            if(imc >= 0 || imc < 16){
                Toast.makeText(getApplicationContext(),"Magreza Grave", Toast.LENGTH_SHORT).show();
            }

            if(imc >= 16 || imc < 17){
                Toast.makeText(getApplicationContext(),"Magreza Moderada", Toast.LENGTH_SHORT).show();
            }

            if(imc >=17 || imc < 18.5){
                Toast.makeText(getApplicationContext(),"Magreza Leve", Toast.LENGTH_SHORT).show();
            }

            if(imc >= 18.5 || imc < 25){
                Toast.makeText(getApplicationContext(),"Peso Normal", Toast.LENGTH_SHORT).show();

            }

            if(imc >= 25 || imc < 30){
                Toast.makeText(getApplicationContext(),"Sobrepeso", Toast.LENGTH_SHORT).show();

            }

            if(imc >= 30 || imc < 35){
                Toast.makeText(getApplicationContext(),"Obesidade Grau 1", Toast.LENGTH_SHORT).show();

            }

            if(imc >= 35 || imc < 40){
                Toast.makeText(getApplicationContext(),"Obesidade Grau 2", Toast.LENGTH_SHORT).show();

            }

            if(imc > 40){
                Toast.makeText(getApplicationContext(),"Obesidade Grau 3", Toast.LENGTH_SHORT).show();

            }else {

                    Toast.makeText(getApplicationContext(),"Dados Invalidos", Toast.LENGTH_SHORT).show();


            }


    }
}
