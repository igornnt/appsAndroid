package br.edu.exemploigor.www.mvplogin;

import android.util.Log;

import br.edu.exemploigor.www.mvplogin.task.Login;

/**
 * Created by igorn on 08/05/2018.
 */

public class PresenterLogin implements Login.Presenter {

    Login.View view;

    public PresenterLogin(Login.View view) {

        this.view = view;
    }

    @Override
    public void validaLogin(String usuario, String senha){

        if(usuario.isEmpty() || senha.isEmpty()) {

            if (usuario.isEmpty()) {
                view.erroDeUsuario();
            }
            if(senha.isEmpty()){
                view.erroDeSenha();
            }

        }else if(usuario.equals("igor") && senha.equals("abc")){
                view.autenticadoComSucesso();
            } else{
                view.autenticadoComFalha();
         }
    }
}
