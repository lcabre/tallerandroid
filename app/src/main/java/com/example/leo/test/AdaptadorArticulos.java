package com.example.leo.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Leo on 28/10/2017.
 */

public class AdaptadorArticulos extends RecyclerView.Adapter
        <AdaptadorArticulos.ViewHolder> {

    private List<Product> productos = new ArrayList<Product>();


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_producto, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Product producto = this.productos.get(position);

        holder.titulo.setText(producto.getTitulo() + " " + position);

        Picasso.with( holder.foto.getContext() )
                .load(producto.getImagen())
                .into(holder.foto);

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(),
                        "Item clickeado: " + producto.getTitulo(),
                        Toast.LENGTH_LONG)
                        .show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.productos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View view;

        @BindView(R.id.foto)
        ImageView foto;
        @BindView(R.id.titulo)
        TextView titulo;
        @BindView(R.id.descripcion)
        TextView descripcion;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);

            this.view = itemView;
        }

    }

    public void mostrarProductos(List<Product> listadoDeProductos) {
        this.productos = listadoDeProductos;
        notifyDataSetChanged();
    }

}
