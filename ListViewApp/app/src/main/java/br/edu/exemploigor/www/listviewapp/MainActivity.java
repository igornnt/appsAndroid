package br.edu.exemploigor.www.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView myLista;
    private String[] cidade = {
        "São Paulo",
        "Santa Catarina",
        "Paraná",
        "Mato grosso do sul"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        myLista = findViewById(R.id.listView);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                cidade
        );

        myLista.setAdapter(adaptador);

        myLista.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valor = myLista.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),valor,Toast.LENGTH_LONG).show();
            }
        });
    }}