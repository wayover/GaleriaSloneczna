package com.example.sloneczna.kino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sloneczna.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.net.URI;

public class KinoFilm extends AppCompatActivity {

    TextView tvTytul;
    TextView tvGodz;
    ImageView imageView;
    Integer img;
    Button cof,rez;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kino_film);

        tvTytul=findViewById(R.id.tvTytulFilmu);
        tvGodz=findViewById(R.id.tvGodzinaFilmu);
        imageView=findViewById(R.id.ivFilmZdj);
        tvTytul.setText(getIntent().getStringExtra("nazwa"));
        tvGodz.setText(getIntent().getStringExtra("godz"));
        int zdj= Integer.parseInt(getIntent().getStringExtra("zdj"));

        imageView.setImageResource(zdj);


        cof=findViewById(R.id.bFilmCofnij);
        rez=findViewById(R.id.bFilmyRezerwuj);

        cof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RepertuarActivity.class);
                startActivity(intent);
            }
        });

        rez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RezerwujActivity.class);
                startActivity(intent);
            }
        });

    }
}