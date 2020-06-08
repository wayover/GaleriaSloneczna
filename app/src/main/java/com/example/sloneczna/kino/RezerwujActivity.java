package com.example.sloneczna.kino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sloneczna.KinoActivity;
import com.example.sloneczna.R;

public class RezerwujActivity extends AppCompatActivity {

    EditText imie,nazwisko,mail,phone;
    SeekBar sb;
    TextView tvs;
    Button cof,go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezerwuj);

        imie=findViewById(R.id.etImie);
        nazwisko=findViewById(R.id.etNazwisko);
        mail=findViewById(R.id.etMail);
        phone=findViewById(R.id.etNR);
        sb=findViewById(R.id.seekBar);
        tvs=findViewById(R.id.tvSEEK);
        cof=findViewById(R.id.bRezCof);
        go=findViewById(R.id.bRezRez);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvs.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        cof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RepertuarActivity.class);
                startActivity(intent);
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(imie.getText().toString().equals("")||nazwisko.getText().toString().equals("")||mail.getText().toString().equals("")||phone.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "Uzupełnij wszystkie dane, żeby zarezerwować!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Miejsca Zarezerwowanie", Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(getApplicationContext(), KinoActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}