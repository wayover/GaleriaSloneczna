package com.example.sloneczna.kino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.view.View;
import android.widget.Button;

import com.example.sloneczna.R;
import com.example.sloneczna.kino.fragment.FragmentCzwartek;
import com.example.sloneczna.kino.fragment.FragmentNiedziela;
import com.example.sloneczna.kino.fragment.FragmentPiatek;
import com.example.sloneczna.kino.fragment.FragmentPoniedzialek;
import com.example.sloneczna.kino.fragment.FragmentSobota;
import com.example.sloneczna.kino.fragment.FragmentSroda;
import com.example.sloneczna.kino.fragment.FragmentWtorek;

public class RepertuarActivity extends AppCompatActivity implements View.OnClickListener {
    Fragment curr=new FragmentCzwartek();
    Button pon,wto,sro,czw,pio,sob,nie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertuar);
        pon=findViewById(R.id.bPoniedzialek);
        wto=findViewById(R.id.bWtorek);
        sro=findViewById(R.id.bSroda);
        czw=findViewById(R.id.bCzwartek);
        pio=findViewById(R.id.bPiatek);
        sob=findViewById(R.id.bSobota);
        nie=findViewById(R.id.bNiedziela);


        pon.setOnClickListener(this);
        wto.setOnClickListener(this);
        sro.setOnClickListener(this);
        czw.setOnClickListener(this);
        pio.setOnClickListener(this);
        sob.setOnClickListener(this);
        nie.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        Fragment selectFragment=null;
        switch (v.getId()) {
            case R.id.bPoniedzialek:
                selectFragment=new FragmentPoniedzialek();
                break;
            case R.id.bWtorek:
                selectFragment=new FragmentWtorek();
                break;
            case R.id.bSroda:
                selectFragment=new FragmentSroda();
                break;
            case R.id.bCzwartek:
                selectFragment=new FragmentCzwartek();
                break;
            case R.id.bPiatek:
                selectFragment=new FragmentPiatek();
                break;
            case R.id.bSobota:
                selectFragment=new FragmentSobota();
                break;
            case R.id.bNiedziela:
                selectFragment=new FragmentNiedziela();
                break;
        }
        getSupportFragmentManager().beginTransaction().hide(curr).commit();
        curr=selectFragment;
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,selectFragment).commit();

    }
}