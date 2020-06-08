package com.example.sloneczna.kino.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.sloneczna.R;
import com.example.sloneczna.adapter.FilmListAdapter;
import com.example.sloneczna.model.Filmy;

import java.util.ArrayList;


public class FragmentNiedziela extends Fragment {

    ListView lvFilmy;
    private android.content.Context Context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_niedziela, container, false);

        lvFilmy=view.findViewById(R.id.lvFilmy7);
        Filmy film1= new Filmy( ""+R.drawable.underdog,"Underdog","9:15","11:15","12:30","23:00","0","0");
        Filmy film2= new Filmy( ""+R.drawable.avengers,"Avengers","0","14:15","0","17:25","19:45","21:30");
        Filmy film3= new Filmy(""+R.drawable.spiderman,"Spider Man","0","13:40","16:40","19:54","0","20:20");
        Filmy film4= new Filmy(""+  R.drawable.joker,"Joker","9:15","14:15","15:00","20:35","21:10","23:50");
        Filmy film5= new Filmy(""+R.drawable.jeden,"1917","0","0","11:11","15:40","16:10","19:25");
        Filmy film6= new Filmy(""+R.drawable.bozec,"Boże Ciało","11:20","13:45","0","21:30","0","0");
        Filmy film7= new Filmy(""+R.drawable.zimnawojna,"Zimna Wojna","0","0","0","11:11","20:00","0");



        ArrayList<Filmy> filmList=new ArrayList<>();
        filmList.add(film1);
        filmList.add(film2);
        filmList.add(film3);
        filmList.add(film4);
        filmList.add(film5);
        filmList.add(film6);
        filmList.add(film7);
        Context=getContext();
        FilmListAdapter adapter =new FilmListAdapter(Context,R.layout.list_item_filmy,filmList);
        lvFilmy.setAdapter(adapter);
        return view;

    }
}