package com.example.currencyconverter.network;

import com.example.currencyconverter.network.Currency;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MonoAPI {
    @GET("/bank/currency")
    public Call<List<Currency>> getCurrencies();


}
