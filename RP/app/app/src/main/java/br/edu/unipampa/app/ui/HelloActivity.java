package br.edu.unipampa.app.ui;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import br.edu.unipampa.app.R;
import br.edu.unipampa.app.network.HelloNetwork;
import br.edu.unipampa.app.network.NetworkClient;
import br.edu.unipampa.app.network.ServerSentEventHandler;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class HelloActivity extends AppCompatActivity {

    TextInputEditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        setTitle("Hello");

        this.input = (TextInputEditText) this.findViewById(R.id.input_hello);
    }

    public void connect(View view) {
        ServerSentEventHandler sse = new ServerSentEventHandler();
        sse.connect();
    }

    public void sendHello(View view) {
        this.getObservable(this.input.getText().toString()).subscribeWith(this.getObserver());
    }

    private Observable<String> getObservable(String message) {
        return NetworkClient.getRetrofit().create(HelloNetwork.class)
                .sendHello(message)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

    }

    private DisposableObserver<String> getObserver() {
        return new DisposableObserver<String>() {
            @Override
            public void onNext(String s) {
                Log.d("Result", s);
            }

            @Override
            public void onError(Throwable e) {
                Log.d("onError", "Error: " + e);
            }

            @Override
            public void onComplete() {

            }
        };
    }
}
