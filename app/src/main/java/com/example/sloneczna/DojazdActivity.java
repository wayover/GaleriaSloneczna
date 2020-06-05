package com.example.sloneczna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class DojazdActivity extends AppCompatActivity implements OnMapReadyCallback {

    Button glowna;
    MapView mapView;
    GoogleMap gMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dojazd);

        mapView=findViewById(R.id.mvMap);
        glowna=findViewById(R.id.bDojazdGlowna);
        glowna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        mapView=findViewById(R.id.mvMap);
        mapView.getMapAsync(this);



    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;

        LatLng galeria=new LatLng(51.406421, 21.155149);
        MarkerOptions gRadom= new MarkerOptions().snippet("Sniped").title("GaleriaSlonecznaLodz").position(galeria).draggable(true);
        Marker markerRadom=gMap.addMarker(gRadom);
    }

}