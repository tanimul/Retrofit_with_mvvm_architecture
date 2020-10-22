package com.example.retrofitwithmvvm.Adapter;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitwithmvvm.Model.CountryName;
import com.example.retrofitwithmvvm.R;

import java.util.ArrayList;
import java.util.List;

public class CountryNameAdapter extends RecyclerView.Adapter<CountryNameAdapter.CountryViewHolder> {
    private Context context;
    private List<CountryName> countryNames;
    private long lastclicktime = 0;

    public CountryNameAdapter(Context context, List<CountryName> countryNames) {
        this.context = context;
        this.countryNames = countryNames;

    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.country_namescard, parent, false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        final CountryName currentcountryname = countryNames.get(position);

        holder.countryname.setText(currentcountryname.getCountryname());
    }

    @Override
    public int getItemCount() {
        return countryNames.size();
    }


    public class CountryViewHolder extends RecyclerView.ViewHolder {
        public TextView countryname;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            countryname = itemView.findViewById(R.id.countryname);
        }
    }

}
