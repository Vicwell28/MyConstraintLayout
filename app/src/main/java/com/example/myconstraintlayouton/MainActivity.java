package com.example.myconstraintlayouton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    TextView idtxt1;
    String num1 = "";
    String num2 = "";
    int Num1 = 0;
    int Num2 = 0;
    String Operacion = "Ninguna";
    int Operacion_Turno = 1;
    int Resultado = 0;
    int Turno = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnuno).setOnClickListener(this);
        findViewById(R.id.btndos).setOnClickListener(this);
        findViewById(R.id.btntres).setOnClickListener(this);
        findViewById(R.id.btncuatro).setOnClickListener(this);
        findViewById(R.id.btncinco).setOnClickListener(this);
        findViewById(R.id.btnseis).setOnClickListener(this);
        findViewById(R.id.btnsiete).setOnClickListener(this);
        findViewById(R.id.btnocho).setOnClickListener(this);
        findViewById(R.id.btnueve).setOnClickListener(this);
        findViewById(R.id.btncero).setOnClickListener(this);

        findViewById(R.id.btnce).setOnClickListener(this);
        idtxt1 = findViewById(R.id.txt1);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(MainActivity.this, "OnClick", Toast.LENGTH_SHORT).show();

        Button boton = (Button) view;

        if (Turno == 1 ){
            idtxt1.setText("");
            num1 = num1+boton.getText().toString();
            idtxt1.setText(num1);

        }
        if(Turno == 2){
            idtxt1.setText("");
            num2 = num2+boton.getText().toString();
            idtxt1.setText(num2);
        }

        //Borrar
        if(boton == findViewById(R.id.btnce)){
            idtxt1.setText("");
            num1 = "";
            num2 = "";
            Num1 = 0;
            Num2 = 0;
            Operacion = "Ninguna";
            Operacion_Turno = 1;
            Resultado = 0;
            Turno = 1;
        }
    }

    public void Suma(View view){
        //Toast.makeText(MainActivity.this, "Suma", Toast.LENGTH_SHORT).show();
        idtxt1.setText("+");
        Operacion = "Suma";
        Turno = 2;
    }

    public void Resta(View view){
        //Toast.makeText(MainActivity.this, "Suma", Toast.LENGTH_SHORT).show();
        idtxt1.setText("-");
        Operacion = "Resta";
        Turno = 2;
    }

    public void Multiplicacion(View view){
        //Toast.makeText(MainActivity.this, "Suma", Toast.LENGTH_SHORT).show();
        idtxt1.setText("*");
        Operacion = "Multiplicacion";
        Turno = 2;
    }

    public void Division(View view){
        //Toast.makeText(MainActivity.this, "Suma", Toast.LENGTH_SHORT).show();
        idtxt1.setText("/");
        Operacion = "Division";
        Turno = 2;
    }

    public void Igual(View view){
        //Toast.makeText(MainActivity.this, "Igual", Toast.LENGTH_SHORT).show();

        if(Operacion=="Suma"){

            if(Operacion_Turno > 1){
                Num2 = Integer.parseInt(num2);
                idtxt1.setText("");
                Resultado = Num2 + Resultado;
                idtxt1.setText(Resultado+"");
                num2 = "";
            }
            else{
                Num1 = Integer.parseInt(num1);
                Num2 = Integer.parseInt(num2);
                idtxt1.setText("");
                Resultado = Num2 + Num1;
                idtxt1.setText(Resultado+"");
                num1 = "";
                num2 = "";
            }
        }
        else if(Operacion=="Resta"){

            if(Operacion_Turno > 1){
                Num2 = Integer.parseInt(num2);
                idtxt1.setText("");
                Resultado = Resultado - Num2;
                idtxt1.setText(Resultado+"");
                num2 = "";
            }
            else{
                Num1 = Integer.parseInt(num1);
                Num2 = Integer.parseInt(num2);
                idtxt1.setText("");
                Resultado = Num1 - Num2;
                idtxt1.setText(Resultado+"");
                num1 = "";
                num2 = "";
            }
        }
        else if(Operacion=="Multiplicacion"){

            if(Operacion_Turno > 1){
                Num2 = Integer.parseInt(num2);
                idtxt1.setText("");
                Resultado = Num2 * Resultado;
                idtxt1.setText(Resultado+"");
                num2 = "";
            }
            else{
                Num1 = Integer.parseInt(num1);
                Num2 = Integer.parseInt(num2);
                idtxt1.setText("");
                Resultado = Num2 * Num1;
                idtxt1.setText(Resultado+"");
                num1 = "";
                num2 = "";
            }
        }
        else if(Operacion=="Division"){

            if(Operacion_Turno > 1){
                Num2 = Integer.parseInt(num2);
                idtxt1.setText("");
                Resultado = Resultado / Num2;
                idtxt1.setText(Resultado+"");
                num2 = "";
            }
            else{
                Num1 = Integer.parseInt(num1);
                Num2 = Integer.parseInt(num2);
                idtxt1.setText("");
                Resultado = Num1 / Num2;
                idtxt1.setText(Resultado+"");
                num1 = "";
                num2 = "";
            }
        }

        Operacion_Turno++;
    }
}