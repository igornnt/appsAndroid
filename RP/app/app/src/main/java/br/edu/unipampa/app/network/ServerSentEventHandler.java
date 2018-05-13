package br.edu.unipampa.app.network;

import android.support.annotation.WorkerThread;
import android.util.Log;

import com.here.oksse.OkSse;
import com.here.oksse.ServerSentEvent;

import okhttp3.Request;
import okhttp3.Response;

public class ServerSentEventHandler {

    private String path = "http://10.0.2.2:8888/hello/stream";

    public void connect() {
        Request request = new Request.Builder().url(path).build();
        OkSse okSse = new OkSse();
        ServerSentEvent sse = okSse.newServerSentEvent(request, this.listener());
    }

    private ServerSentEvent.Listener listener() {
        return new ServerSentEvent.Listener() {
            @Override
            public void onOpen(ServerSentEvent sse, Response response) {
                Log.i("onOpen", "Conexão Aberta");
            }

            @Override
            public void onMessage(ServerSentEvent sse, String id, String event, String message) {
                Log.i("onMessage", message);
            }

            @WorkerThread
            @Override
            public void onComment(ServerSentEvent sse, String comment) {
                Log.i("onComment", comment);
            }

            @WorkerThread
            @Override
            public boolean onRetryTime(ServerSentEvent sse, long milliseconds) {
                return true; // True to use the new retry time received by SSE
            }

            @WorkerThread
            @Override
            public boolean onRetryError(ServerSentEvent sse, Throwable throwable, Response response) {
                return true; // True to retry, false otherwise
            }

            @WorkerThread
            @Override
            public void onClosed(ServerSentEvent sse) {
                Log.i("onClosed", "Conexão Encerrada");
            }

            @WorkerThread
            @Override
            public Request onPreRetry(ServerSentEvent sse, Request originalRequest) {
                return null;
            }
        };
    }

}
