package com.example.retrofitwithmvvm.Interface;



import com.example.retrofitwithmvvm.Model.CountryName;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("countries")
    Observable<List<CountryName>> getcountryname();

}
