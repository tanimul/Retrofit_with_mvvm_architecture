package com.example.retrofitwithmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.retrofitwithmvvm.Adapter.CountryNameAdapter;
import com.example.retrofitwithmvvm.Interface.ApiInterface;
import com.example.retrofitwithmvvm.Model.CountryName;
import com.example.retrofitwithmvvm.Retrofit.ApiClient;
import com.example.retrofitwithmvvm.Retrofit.ViewModel_Country;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main_Activity";
//    ViewModel_Country viewModel_country;
//    List<CountryName> countryNameList;
//    private CountryNameAdapter countryNameAdapter;
//    private RecyclerView recyclerView;
//    private ApiInterface apiInterface;
//    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        viewModel_country = ViewModelProviders.of(this).get(ViewModel_Country.class);
//        apiInterface = ApiClient.getClient().create(ApiInterface.class);
//
//        recyclerView = findViewById(R.id.recyclerview_countrynames);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        countryNameList = new ArrayList<>();
//        countryNameAdapter = new CountryNameAdapter(MainActivity.this, countryNameList);
//        recyclerView.setAdapter(countryNameAdapter);
//
//        compositeDisposable.add(apiInterface.getcountryname()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<List<CountryName>>() {
//                    @Override
//                    public void accept(List<CountryName> countryNames) throws Exception {
//                        for (CountryName countryName : countryNames) {
//                            countryNameList.add(new CountryName(countryName.getCountryname()));
//                        }
//                        countryNameAdapter.notifyDataSetChanged();
//                    }
//                }));

    }
}