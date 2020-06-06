package com.example.sloneczna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sloneczna.kino.KinoCennik;
import com.example.sloneczna.kino.KinoKontakt;

public class KinoActivity extends AppCompatActivity {

    Button repertuar,cennik,kontakt,strona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kino);

        repertuar=findViewById(R.id.bRepertuar);
        cennik=findViewById(R.id.bCennik);
        kontakt=findViewById(R.id.bKinoKontakt);
        strona=findViewById(R.id.bStronaGlw);

        strona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        cennik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), KinoCennik.class);
                startActivity(intent);
            }
        });

        kontakt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), KinoKontakt.class);
                startActivity(intent);
            }
        });
    }
}