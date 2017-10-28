package com.example.leo.test;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Leo on 7/10/2017.
 */

class Product {

    @SerializedName("price")
    private Long precio;

    @SerializedName("title")
    private String titulo;

    @SerializedName("thumbnail")
    private String imagen;

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
