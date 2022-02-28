package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calcular,cerrar;
    private EditText peso;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = findViewById(R.id.btncalcular);
        peso = findViewById(R.id.caja);
        resultado= findViewById(R.id.ver);
        cerrar  = (Button) findViewById(R.id.btnl);
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);

            }

        });

    }

    public  void  operar(View view) {
        double npeso = Double.parseDouble(peso.getText().toString());


        double resultadoc = 220- npeso;

        resultado.setText( resultadoc + " bpm ");
    }
}