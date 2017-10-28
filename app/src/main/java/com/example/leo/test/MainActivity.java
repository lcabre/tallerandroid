package com.example.leo.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.titulo)//estos binds son por butterfly
    TextView titulo;

    @BindView(R.id.imagen)
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        this.titulo.setText("Notebook HP Omen");
        //this.imagen.setImageResource(R.drawable.imagen);//reemplazado por picasso
        Picasso.with(this).load(R.drawable.imagen).into(imagen);
    }
}
