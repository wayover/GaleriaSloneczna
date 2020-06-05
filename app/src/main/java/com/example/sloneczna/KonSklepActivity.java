package com.example.sloneczna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

public class KonSklepActivity extends AppCompatActivity {
        Button btn;
        ImageView zdjecie;
        TextView nazwa;
        TextView opis;
        Button kontakt;
         String tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kon_sklep);

        opis=findViewById(R.id.tvOpis);
        opis.setText(getIntent().getStringExtra("opis"));
        nazwa=findViewById(R.id.tvStr);
        nazwa.setText(getIntent().getStringExtra("nazwa"));

        kontakt=findViewById(R.id.bKontakt);
        tel=getIntent().getStringExtra("numer");

        kontakt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: "+tel));
                startActivity(intent);
            }
        });


        String zdj=getIntent().getStringExtra("obraz");
        zdjecie= findViewById(R.id.ivStr);
        Context context=getApplicationContext();
        ImageLoader imageLoader = ImageLoader.getInstance();

        int defaultImage = context.getResources().getIdentifier("@drawable/image_failed",null,context.getPackageName());

        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(defaultImage)
                .showImageOnLoading(defaultImage).build();

        imageLoader.displayImage(zdj,zdjecie,options);










        btn=findViewById(R.id.bSklepList);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SklepyActivity.class);
                startActivity(intent);
            }
        });
    }
}