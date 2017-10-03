package com.example.hola;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText texto, enlace;
    private Button saludar, navegar;
    private Intent i;
    public static final String DATO = "nombre";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        saludar = (Button) findViewById(R.id.btnSaludar);
        navegar = (Button)findViewById(R.id.btnNavegar);
        texto = (EditText) findViewById(R.id.edtNombre);
        enlace = (EditText) findViewById(R.id.edtURL);
        saludar.setOnClickListener(this);
        navegar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == saludar)
        {
            i = new Intent(this, AdiosActivity.class);
            i.putExtra(DATO, texto.getText().toString());
            startActivity(i);
        }
        if (view == navegar)
        {
            openWebPage(enlace.getText().toString());
        }
    }

    private void openWebPage(String url)
    {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
        else
            {
                Toast.makeText(this, "Error en la URL", Toast.LENGTH_SHORT).show();
            }
    }

}
