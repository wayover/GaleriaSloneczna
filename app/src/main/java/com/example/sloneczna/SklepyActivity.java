package com.example.sloneczna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sloneczna.adapter.SklepListAdapter;
import com.example.sloneczna.model.sklep;

import java.util.ArrayList;
import java.util.List;

public class SklepyActivity extends AppCompatActivity {

    private static final String TAG = "activity_sklepy";
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sklepy);

        listView=findViewById(R.id.lvLista);
        Log.d(TAG,"created");

        sklep jeden = new sklep("drawable://" + R.drawable.sowa,"Sowa");
        sklep dwa = new sklep("drawable://" + R.drawable.alma,"Alma");
        sklep trzy = new sklep("drawable://" + R.drawable.lidl,"Lidl");
        sklep cztery = new sklep("drawable://" + R.drawable.empik,"Empik");
        sklep piec = new sklep("drawable://" + R.drawable.zara,"Zara");
        sklep szesc = new sklep("drawable://" + R.drawable.hm,"H&M");
        sklep siedem = new sklep("drawable://" + R.drawable.rtv,"RTV EURO AGD");
        sklep osiem = new sklep("drawable://" + R.drawable.apart,"Apart");
        sklep dziewiec = new sklep("drawable://" + R.drawable.diverse,"Diverse");
        sklep dziesiec = new sklep("drawable://" + R.drawable.ccc,"CCC");
        sklep jedena = new sklep("drawable://" + R.drawable.croop,"Croop");
        sklep dwana = new sklep("drawable://" + R.drawable.kfc,"KFC");

        ArrayList<sklep> skleplist=new ArrayList<>();
        skleplist.add(jeden);
        skleplist.add(dwa);
        skleplist.add(trzy);
        skleplist.add(cztery);
        skleplist.add(piec);
        skleplist.add(szesc);
        skleplist.add(siedem);
        skleplist.add(osiem);
        skleplist.add(dziewiec);
        skleplist.add(dziesiec);
        skleplist.add(jedena);
        skleplist.add(dwana);

        SklepListAdapter adapter=new SklepListAdapter(this,R.layout.list_item_1,skleplist);
        listView.setAdapter(adapter);

    }

}