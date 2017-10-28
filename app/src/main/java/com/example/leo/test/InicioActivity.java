package com.example.leo.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InicioActivity extends AppCompatActivity{

    @BindView(R.id.buscar)
    Button boton;

    @BindView(R.id.textoBuscar)
    EditText textoBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buscar)
    public void onClick() {
        Intent i = new Intent(InicioActivity.this, ResultadoBusquedaActivity.class);// intento ir de una view a la otra

        String texto = textoBuscar.getText().toString();
        i.putExtra("textoBuscar", texto);
        startActivity(i);// ejecuto la actividad
    }

}
