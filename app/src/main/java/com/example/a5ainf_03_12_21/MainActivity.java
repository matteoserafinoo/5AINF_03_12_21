package com.example.a5ainf_03_12_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listas; //creazione di un oggetto lista view
    String aStati[] = {"Italia", "Francia", "Germania", "Spagna"}; //creazione di un oggetto tipo array, inizializzato
    //array adapter = oggetto con array, che permette di legare strettamante un array adapter alla list view, cosi al cambiare dell'array cambia anche la lista view



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listas = (ListView)findViewById(R.id.listastati); //il cast per trasformarlo in un oggetto list view
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,R.layout.activity_main,R.id.listastati,aStati);

        listas.setAdapter(aa);

        //recuperato un riferimento del bottone (tramite l'id) e registrato un ascoltatore al click
        final Button bb = (Button)findViewById(R.id.bottone);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}