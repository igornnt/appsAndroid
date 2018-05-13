package br.edu.unipampa.app.network;

import io.reactivex.Observable;

import retrofit2.http.Body;
import retrofit2.http.POST;

public interface HelloNetwork {

    @POST("hello")
    Observable<String> sendHello(@Body String hello);

}
