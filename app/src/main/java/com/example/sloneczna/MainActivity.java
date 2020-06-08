package com.example.sloneczna;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button sklepy,kino,jakdojechac,godzinyotwarcia,kontakt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sklepy=findViewById(R.id.bSklepy);
        kino=findViewById(R.id.bKino);
        jakdojechac=findViewById(R.id.bDojazd);
        godzinyotwarcia=findViewById(R.id.bGodz);
        kontakt=findViewById(R.id.bKontakt);

        sklepy.setOnClickListener(this);
        kino.setOnClickListener(this);
        jakdojechac.setOnClickListener(this);
        godzinyotwarcia.setOnClickListener(this);
        kontakt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()){
            case R.id.bSklepy:
                intent = new Intent(getApplicationContext(), SklepyActivity.class);
                startActivity(intent);
                break;
            case R.id.bKino:
                intent = new Intent(getApplicationContext(), KinoActivity.class);
                startActivity(intent);
                break;
            case R.id.bDojazd:
                //intent = new Intent(getApplicationContext(), MapsFragment.class);
                intent = new Intent(getApplicationContext(), DojazdActivity.class);
                startActivity(intent);
                break;
            case R.id.bGodz:
                intent = new Intent(getApplicationContext(), GodzinyActivity.class);
                startActivity(intent);
                break;
            case R.id.bKontakt:
                intent = new Intent(getApplicationContext(), KontaktActivity.class);
                startActivity(intent);
                break;

        }
    }
}