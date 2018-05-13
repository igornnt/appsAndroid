package br.edu.exemploigor.www.consumindoumaapi;


import br.edu.exemploigor.www.consumindoumaapi.models.UdacityCatalog;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by igorn on 13/05/2018.
 */

public interface UdacityService {

    public static final String BASE_URL = "https://www.udacity.com/public-api/v0/";

    @GET("courses")
    Call<UdacityCatalog> listCatalog();

}
