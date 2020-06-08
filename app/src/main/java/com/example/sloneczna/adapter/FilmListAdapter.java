package com.example.sloneczna.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ListAdapter;

import com.example.sloneczna.R;
import com.example.sloneczna.SklepyActivity;
import com.example.sloneczna.kino.KinoFilm;
import com.example.sloneczna.model.Filmy;

import java.util.ArrayList;

public class FilmListAdapter extends ArrayAdapter<Filmy> {

    private Context nContext;
    int nResource;
    Button bButt1,bButt2,bButt3,bButt4,bButt5,bButt6;
    TextView tvNazwa;
    public FilmListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Filmy> objects) {
        super(context, resource, objects);
        nContext=context;
        nResource=resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         final String zdj=getItem(position).getZdj();
         final String nazwa= getItem(position).getFilmy();
         final String godz1=getItem(position).getB1();
         final String godz2=getItem(position).getB2();
         final String godz3=getItem(position).getB3();
         final String godz4=getItem(position).getB4();
         final String godz5=getItem(position).getB5();
         final String godz6=getItem(position).getB6();

         Filmy filmy= new Filmy(zdj,nazwa,godz1,godz2,godz3,godz4,godz5,godz6);

        LayoutInflater inflater= LayoutInflater.from(nContext);
        convertView = inflater.inflate(nResource,parent,false);
        tvNazwa=convertView.findViewById(R.id.tvNazwaFilmu);
        bButt1=convertView.findViewById(R.id.bGodz1);
        bButt2=convertView.findViewById(R.id.bGodz2);
        bButt3=convertView.findViewById(R.id.bGodz3);
        bButt4=convertView.findViewById(R.id.bGodz4);
        bButt5=convertView.findViewById(R.id.bGodz5);
        bButt6=convertView.findViewById(R.id.bGodz6);

        tvNazwa.setText(nazwa);

        if(!godz1.equals("0")) {
            bButt1.setText(godz1);
            bButt1.setVisibility(convertView.VISIBLE);
        }
        if(!godz2.equals("0")) {
            bButt2.setText(godz2);
            bButt2.setVisibility(convertView.VISIBLE);
        }
        if(!godz3.equals("0")) {
            bButt3.setText(godz3);
            bButt3.setVisibility(convertView.VISIBLE);
        }
        if(!godz4.equals("0")) {
            bButt4.setText(godz4);
            bButt4.setVisibility(convertView.VISIBLE);
        }
        if(!godz5.equals("0")) {
            bButt5.setText(godz5);
            bButt5.setVisibility(convertView.VISIBLE);
        }
        if(!godz6.equals("0")) {
            bButt6.setText(godz6);
            bButt6.setVisibility(convertView.VISIBLE);
        }

        bButt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nContext, KinoFilm.class);
                intent.putExtra("nazwa",nazwa);
                intent.putExtra("godz",godz1);
                intent.putExtra("zdj",zdj);
                nContext.startActivity(intent);
            }
        });
        bButt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nContext, KinoFilm.class);
                intent.putExtra("nazwa",nazwa);
                intent.putExtra("godz",godz2);
                intent.putExtra("zdj",zdj);
                nContext.startActivity(intent);
            }
        });
        bButt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nContext, KinoFilm.class);
                intent.putExtra("nazwa",nazwa);
                intent.putExtra("godz",godz3);
                intent.putExtra("zdj",zdj);
                nContext.startActivity(intent);
            }
        });
        bButt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nContext, KinoFilm.class);
                intent.putExtra("nazwa",nazwa);
                intent.putExtra("godz",godz4);
                intent.putExtra("zdj",zdj);
                nContext.startActivity(intent);
            }
        });
        bButt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nContext, KinoFilm.class);
                intent.putExtra("nazwa",nazwa);
                intent.putExtra("godz",godz5);
                intent.putExtra("zdj",zdj);
                nContext.startActivity(intent);
            }
        });
        bButt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nContext, KinoFilm.class);
                intent.putExtra("nazwa",nazwa);
                intent.putExtra("godz",godz6);
                intent.putExtra("zdj",zdj);
                nContext.startActivity(intent);
            }
        });


        return convertView;
    }



}
