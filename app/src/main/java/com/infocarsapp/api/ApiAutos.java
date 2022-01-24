package com.infocarsapp.api;

import com.infocarsapp.vo.Autos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiAutos {
    public static final String URL_REST = "http://192.168.1.251:3000";

    /* list autos */
    @GET("/autos")
    Call<List<Autos>> list();
}