package com.example.retrofitwithmvvm.Model;

import com.google.gson.annotations.SerializedName;

public class CountryName {

    @SerializedName("Country")
    private String countryname;

    public CountryName(String countryname) {
        this.countryname = countryname;
    }

    public String getCountryname() {
        return countryname;
    }

}
