package edu.upc.dsa.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnpunto,btnigual,btndiv,btnresta,btnsuma,btnborrar,btnmulti;
    TextView textView,textView2;
    String process;
    private final char SUMA = '+';
    private final char RESTA = '-';
    private final char MULTI = '*';
    private final char DIV = '/';
    private final char RESULTADO = 0;
    private double val = Double.NaN;
    private double val2;
    private char accion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnpunto = findViewById(R.id.btnpunto);
        btnigual = findViewById(R.id.btnigual);
        btndiv = findViewById(R.id.btndiv);
        btnresta = findViewById(R.id.btnresta);
        btnsuma = findViewById(R.id.btnsuma);
        btnmulti = findViewById(R.id.btnmulti);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        btnborrar = findViewById(R.id.btnborrar);


        btnborrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                textView.setText("");
                textView2.setText("");
            }
        });




        btn0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "9");
            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "+");
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "-");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "/");
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + "*");
            }
        });
        btnpunto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                textView.setText(process + ".");
            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                process = textView.getText().toString();
                

            }
        });
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(null);

                compute();
                accion = SUMA;
                textView2.setText(String.valueOf(val) + '+');

                textView.setText(null);

            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                accion = RESTA;
                textView2.setText(String.valueOf(val) + '-');
                textView.setText(null);

            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                accion = MULTI;
                textView2.setText(String.valueOf(val) + '*');
                textView.setText(null);

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                accion = DIV;
                textView2.setText(String.valueOf(val) + '/');
                textView.setText(null);

            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                accion = RESULTADO;
                textView2.setText(textView2.getText().toString() + String.valueOf(val2) + "=" +String.valueOf(val));
                olvidar();
                textView.setText(null);
            }
        });




;    }

    private void compute(){
        if(!Double.isNaN(val)){
            val2 = Double.parseDouble(textView.getText().toString());

            switch (accion) {
                case SUMA:
                    val = val + val2;
                    break;
                case RESTA:
                    val = val - val2;
                    break;
                case MULTI:
                    val = val * val2;
                    break;
                case DIV:
                    val = val / val2;
                    break;
                case RESULTADO:

                    break;
            }

        }
        else {
            val = Double.parseDouble(textView.getText().toString());



        }


    }
    private void olvidar(){
        val=0;
    }






}