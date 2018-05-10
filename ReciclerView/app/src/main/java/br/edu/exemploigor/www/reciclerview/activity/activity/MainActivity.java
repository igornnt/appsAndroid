package br.edu.exemploigor.www.reciclerview.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import br.edu.exemploigor.www.reciclerview.R;
import br.edu.exemploigor.www.reciclerview.activity.adapter.AdapterLista;

public class MainActivity extends AppCompatActivity {

    // 1 Vamos declarar aqui um recicler view
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 Vamos criar uma instância deste Recicler View pegando o elemento com ID
        recyclerView = findViewById(R.id.recyclerView);

        //Configurar o adaptador: Ele que vai receber os dados, formatar o layout
        AdapterLista adapter= new AdapterLista();

        //Configurar ReciclerView
        // Um processo simples, vamos utilizar um layout manager;
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        // ==========Fim de configuraçao ==========
        recyclerView.setAdapter(adapter);



    }
}
