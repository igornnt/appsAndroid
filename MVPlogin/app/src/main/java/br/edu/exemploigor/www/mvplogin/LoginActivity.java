package br.edu.exemploigor.www.mvplogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import br.edu.exemploigor.www.mvplogin.task.Login;

public class LoginActivity extends AppCompatActivity implements Login.View {

    private Login.Presenter presenterLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenterLogin = (Login.Presenter) new PresenterLogin(this);
    }

    public void clickDoBotaoLogar(View view){

        TextView textUsuario = findViewById(R.id.input_usuario);
        TextView textSenha = findViewById(R.id.input_senha);
        String usuario = textUsuario.getText().toString();
        String senha = textSenha.getText().toString();
//        Log.i("dados",senha);
        presenterLogin.validaLogin(usuario,senha);
    }

    public void erroDeUsuario() {

        EditText errousuario = findViewById(R.id.input_usuario);
        errousuario.setError("Campo não pode estar vázio");
    }

    public void erroDeSenha() {

        EditText errosenha = findViewById(R.id.input_senha);
        errosenha.setError("Campo não pode estar vázio");

    }


    public void autenticadoComSucesso() {

        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);

    }

    public void autenticadoComFalha() {

        Toast.makeText(this,"Usuário ou senha incorreta!", Toast.LENGTH_LONG).show();


    }
}
