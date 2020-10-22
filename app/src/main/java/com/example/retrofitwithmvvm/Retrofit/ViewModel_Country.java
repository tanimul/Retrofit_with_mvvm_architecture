package com.example.retrofitwithmvvm.Retrofit;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.retrofitwithmvvm.Model.CountryName;

import java.util.List;

public class ViewModel_Country extends AndroidViewModel {
    private Repository_Country repository_country;

    public ViewModel_Country(@NonNull Application application) {
        super(application);
        repository_country=new Repository_Country();
    }

    public LiveData<List<CountryName>> getcountryname(){
        return repository_country.getcountryname();
    }
}
