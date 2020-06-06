package com.example.sloneczna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sloneczna.adapter.SklepListAdapter;
import com.example.sloneczna.model.sklep;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

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


        final ArrayList<String> opisy=new ArrayList<>();
        opisy.add("Cukiernia Sowa to magiczne miejsce, w którym skosztujesz sowitej porcji niepowtarzalnego smaku i wyjątkowej atmosfery.");
        opisy.add("Delikatesy Alma to miejsce, w którym rozpoczyna się podróż po fascynującym świecie kulinarnych doznań. Oferują one ponad 60 000 produktów,");
        opisy.add("Każdego dnia firma Lidl Polska dąży do tego aby zapewniać klientom wysokiej jakości artykuły, w atrakcyjnej niskiej cenie, wyprodukowane w sposób zrównoważony. Postępujemy w myśl idei „Więcej na radość z życia”. Dążymy do tego aby nasi klienci dokonując zakupów w sklepach Lidl, dzięki oszczędności czasu i pieniędzy, mieli więcej aby cieszyć się życiem tak jak lubią.");
        opisy.add("Działająca w Polsce sieć sprzedaży książek, wydawnictw muzycznych, filmów, gier, programów, odbitek, audiobooków i akcesoriów komputerowych oraz prasy, a także biletów na wydarzenia kulturalne i rozrywkowe, artykułów wyposażenia wnętrz i kulinarnych, gadżetów podróżniczych i jeszcze więcej.");
        opisy.add("Hiszpańskie przedsiębiorstwo należące do grupy Inditex. Główna siedziba spółki mieści się w La Coruñi, gdzie w 1975 roku otwarto pierwszy sklep tej marki. Inditex jest rozwijającą się firmą odzieżową, która posiada ponad 2700 sklepów w 60 państwach.");
        opisy.add("H&M, od H & M Hennes & Mauritz AB – szwedzkie przedsiębiorstwo odzieżowe, z siedzibą w Sztokholmie.");
        opisy.add("Polska sieć detaliczna oferująca elektronikę użytkową, telewizory i sprzęt RTV, duże i małe AGD, komputery, tablety, telefony, sprzęt fotograficzny, gry i konsole oraz akcesoria. W 2019 posiadał 277 sklepów RTV Euro AGD w 177 miejscowościach.");
        opisy.add("Powstało w 1983 roku. Jego nazwa powstała z połączenia pierwszych liter imion założycieli – Adama i Piotra Rączyńskich – ze słowem „art” oznaczającym „sztukę”. W 1997 roku otworzono pierwszy firmowy salon jubilerski w Poznaniu.");
        opisy.add("Marka odzieżowa powstała w 1993 roku. Właścicielem marki jest firma ETOS S.A. z siedzibą w Gdańsku. Oferuje odzież damską i męską, której uzupełnieniem są akcesoria, obuwie oraz torby i plecaki.");
        opisy.add("Sprzedaż obuwia prowadzona jest w ramach własnych salonów firmowych oraz sklepów działających na zasadzie franczyzy. W 2019 roku pod marką CCC działało 1219 sklepów. Źródła zaopatrzenia stanowią zarówno producenci zagraniczni, jak i krajowi. Istotną przewagę rynkową daje Grupie posiadanie własnej produkcji obuwia w ramach CCC Factory.");
        opisy.add("Polska sieć odzieżowa z siedzibą w Gdańsku specjalizująca się w szeroko pojętej modzie ulicznej. Należy do spółki LPP SA. Pierwszy sklep Cropp Town został otwarty w marcu 2004 roku. Łącznie sieć liczy ponad 360 salonów w tym 180 Polsce i 140 salonów za granicą.");
        opisy.add("Amerykańska sieć barów szybkiej obsługi założona 20 marca 1930 roku przez Harlanda Sandersa, bardziej znanego jako pułkownik Sanders. Siedziba przedsiębiorstwa znajduje się w Louisville, w stanie Kentucky, w Stanach Zjednoczonych.");

        final ArrayList<String>numery=new ArrayList<>();
        numery.add("543534534");
        numery.add("645656345");
        numery.add("657456457");
        numery.add("456743653");
        numery.add("896758678");
        numery.add("956784465");
        numery.add("513453145");
        numery.add("765344567");
        numery.add("907895657");
        numery.add("652456246");
        numery.add("753674563");
        numery.add("432534523");

        final ArrayList<sklep> skleplist=new ArrayList<>();
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


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), KonSklepActivity.class);
                intent.putExtra("nazwa",skleplist.get(position).getNazwa());
                intent.putExtra("obraz",skleplist.get(position).getImgurl());
                intent.putExtra("opis",opisy.get(position));
                intent.putExtra("numer",numery.get(position));

        startActivity(intent);

    }
});



    }

}