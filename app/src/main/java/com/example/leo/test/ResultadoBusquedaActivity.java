package com.example.leo.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Leo on 7/10/2017.
 */

public class ResultadoBusquedaActivity extends AppCompatActivity{
    //private List<Product> results;

    @BindView(R.id.textoBuscar)
    TextView textoBuscar;

    @BindView(R.id.listaHolder)
    RecyclerView listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_busqueda);
        ButterKnife.bind(this);

        String texto = getIntent().getStringExtra("textoBuscar");
        this.textoBuscar.setText(texto);

        configurarListado();
    }

    private void configurarListado() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        this.listado.setLayoutManager(layoutManager);

        AdaptadorArticulos adapter = new AdaptadorArticulos();

        List<Product> listadoDeProductos = new ArrayList<>();
        listadoDeProductos.add(new Product("producto 1", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        listadoDeProductos.add(new Product("lavarropas", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        listadoDeProductos.add(new Product("producto 1", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        listadoDeProductos.add(new Product("lavarropas", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        listadoDeProductos.add(new Product("producto 1", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        listadoDeProductos.add(new Product("lavarropas", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        listadoDeProductos.add(new Product("producto 1", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        listadoDeProductos.add(new Product("lavarropas", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        listadoDeProductos.add(new Product("producto 1", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        listadoDeProductos.add(new Product("lavarropas", "https://image.freepik.com/iconos-gratis/simbolo-de-un-telefono-auricular-en-un-circulo_318-50200.jpg"));
        adapter.mostrarProductos(listadoDeProductos);

        this.listado.setAdapter(adapter);

    }
}
