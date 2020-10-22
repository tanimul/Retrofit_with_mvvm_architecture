package com.example.retrofitwithmvvm.Retrofit;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.retrofitwithmvvm.Interface.ApiInterface;
import com.example.retrofitwithmvvm.Model.CountryName;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class Repository_Country {
    private static final String TAG = "Repository_Country";
    private ApiInterface apiInterface;

    public Repository_Country() {
        apiInterface = ApiClient.getClient();
    }

    public LiveData<List<CountryName>> getcountryname() {
        final MutableLiveData<List<CountryName>> response = new MutableLiveData<>();

        apiInterface.getcountryname()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<CountryName>>() {
                    @Override
                    public void accept(List<CountryName> countryNames) throws Exception {
                        response.postValue(countryNames);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d(TAG, "accept: error:" + throwable.getMessage());
                    }
                });

        return response;
    }

}
