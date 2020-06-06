package com.example.sloneczna.kino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sloneczna.KinoActivity;
import com.example.sloneczna.R;

public class KinoCennik extends AppCompatActivity {

    Button cofnij;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kino_cennik);

        cofnij=findViewById(R.id.bKinoCofnij);

        cofnij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), KinoActivity.class);
                startActivity(intent);
            }
        });
    }
}