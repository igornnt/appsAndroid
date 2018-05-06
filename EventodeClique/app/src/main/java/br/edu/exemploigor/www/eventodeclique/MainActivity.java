package br.edu.exemploigor.www.eventodeclique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterandoTexto(View view){

        TextView texto = findViewById(R.id.textoNaTela);
        texto.setText("Conseguimos alterar o texto na tela! :)");

    }
}
