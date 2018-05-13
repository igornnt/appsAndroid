package br.edu.unipampa.app.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import br.edu.unipampa.app.MainActivity;
import br.edu.unipampa.app.R;
import br.edu.unipampa.app.model.ItemDePauta;
import br.edu.unipampa.app.ui.HelloActivity;
import br.edu.unipampa.app.uiActivity.OpcoesDeVotoActivity;

/**
 * Created by igorn on 10/05/2018.
 */

public class AdapterExibicao extends RecyclerView.Adapter<AdapterExibicao.MyViewHolder>{

    List<ItemDePauta> listaDosItensPauta;
    Context context;

    public AdapterExibicao(Context c ,List<ItemDePauta> listaItem) {
            this.listaDosItensPauta = listaItem;
            this.context = c;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemDeExibicao = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_exibicao_de_votacao, parent, false);

        return new MyViewHolder(itemDeExibicao);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){

        ItemDePauta itemDePauta = listaDosItensPauta.get(position);
        holder.descricao.setText(itemDePauta.getDescricao());
        holder.relator.setText(itemDePauta.getRelator());

        holder.btn.setOnClickListener(holder);

    }

    @Override
    public int getItemCount() {
        return listaDosItensPauta.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements OnClickListener {

        TextView descricao;
        TextView relator;
        Button btn;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.descricao = itemView.findViewById(R.id.textDescricao);
            this.relator = itemView.findViewById(R.id.textRelator);
            this.btn = itemView.findViewById(R.id.button5voto);

            btn.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(context, OpcoesDeVotoActivity.class);
            v.getContext().startActivity(intent);

        }
    }

}
