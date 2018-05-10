package br.edu.exemploigor.www.mvplogin.task;

/**
 * Created by igorn on 09/05/2018.
 */

public interface Login {

    interface View{

        void erroDeUsuario();
        void erroDeSenha();
        void autenticadoComSucesso();
        void autenticadoComFalha();

    }
    interface Presenter{

        void validaLogin(String usuario, String senha);
    }

}
