package com.example.sloneczna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class KinoActivity extends AppCompatActivity {

    Button repertuar,cennik,kontakt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kino);

        repertuar=findViewById(R.id.bRepertuar);
        cennik=findViewById(R.id.bCennik);
        kontakt=findViewById(R.id.bKinoKontakt);
    }
}