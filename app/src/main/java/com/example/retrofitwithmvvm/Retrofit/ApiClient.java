package com.example.retrofitwithmvvm.Retrofit;

import com.example.retrofitwithmvvm.Interface.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit = null;
    private static ApiInterface api_interface;
    public static final String BASEURL="https://api.covid19api.com/";


    public static synchronized ApiInterface getClient(){
        if (retrofit == null) {
            retrofit = new  Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
            api_interface=retrofit.create(ApiInterface.class);
        }
        return api_interface;
    }

}
