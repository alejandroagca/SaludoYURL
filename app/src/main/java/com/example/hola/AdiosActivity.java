package com.example.hola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdiosActivity extends AppCompatActivity{


    TextView respuesta;
    public static final String DATO = ("nombre");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adios);
        respuesta = (TextView) findViewById(R.id.txtRespuesta);
        respuesta.setText(getIntent().getExtras().getString(DATO));
    }
}
