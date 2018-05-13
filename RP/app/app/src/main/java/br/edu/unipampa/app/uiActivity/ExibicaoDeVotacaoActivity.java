package br.edu.unipampa.app.uiActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.edu.unipampa.app.R;
import br.edu.unipampa.app.adapter.AdapterExibicao;
import br.edu.unipampa.app.model.ItemDePauta;

public class ExibicaoDeVotacaoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<ItemDePauta> itemDePautaList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibicao_de_votacao);

        addItemPauta();

        AdapterExibicao adapterExibicao = new AdapterExibicao(this,itemDePautaList);

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterExibicao);
    }

    public void addItemPauta(){

        ItemDePauta itemDePauta1 = new ItemDePauta();
        itemDePauta1.setDescricao("Criação de um novo PTT da engenharia de software");
        itemDePauta1.setRelator("Kreutz da silva");
        itemDePautaList.add(itemDePauta1);

        ItemDePauta itemDePauta2 = new ItemDePauta();
        itemDePauta2.setDescricao("Utilização de formas de aplicar provas");
        itemDePauta2.setRelator("Joao paula da silva");
        itemDePautaList.add(itemDePauta2);
    }

    public void onClickEmUmItem(){

        

    }

}
