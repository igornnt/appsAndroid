package br.edu.exemploigor.www.reciclerview.activity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.edu.exemploigor.www.reciclerview.R;

/**
 * Created by igorn on 10/05/2018.
 */
//Preciso definir uma viewHolder dentro de <>
    // gerado 10 visualizações ele vai reaproveitar
    // Recicla para otimizar a lista
    // Cria visualizações na tela e apartir que vc sobe ele vai reaproveitando e cada elemento
    //é um viewHolder
public class AdapterLista extends RecyclerView.Adapter<AdapterLista.MyViewHolder> {

    //O Método on Create View Holder vai criar as primeiras visualizações para o usuário
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.titulo.setText("Titulo de teste");
        holder.genero.setText("Comédia");
        holder.ano.setText("2000");


    }

    @Override
    public int getItemCount() {
        return 5;
    }

    //classe para guardar os dados e vai exibir dentro desta view
    public class MyViewHolder extends RecyclerView.ViewHolder {

        //Atributos de cada item da tela
        TextView titulo;
        TextView ano;
        TextView genero;

        public MyViewHolder(View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);
        }
    }

}
