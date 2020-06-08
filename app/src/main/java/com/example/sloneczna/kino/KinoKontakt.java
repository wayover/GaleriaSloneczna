package com.example.sloneczna.kino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sloneczna.KinoActivity;
import com.example.sloneczna.R;

public class KinoKontakt extends AppCompatActivity {
Button cofnij;
TextView mail1,mail2,tel1,tel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kino_kontakt);
        cofnij=findViewById(R.id.bKontaktCofnij);
        mail1=findViewById(R.id.tvMailJeden);
        mail2=findViewById(R.id.tvEmailDwa);
        tel1=findViewById(R.id.tvTelJeden);
        tel2=findViewById(R.id.tvTelDwa);


        cofnij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), KinoActivity.class);
                startActivity(intent);
            }
        });

        tel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: "+tel1.getText()));
                startActivity(intent);
            }
        });


        tel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: "+tel2.getText()));
                startActivity(intent);
            }
        });

        mail1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, mail1.getText().toString());

                startActivity(intent);
            }
        });

    }
}