package com.example.currencyconverter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CurrenciesActivity extends AppCompatActivity {

    TextView usdBuyText, eurBuyText, gbpBuyText, plnBuyText;
    TextView usdSellText, eurSellText, gbpSellText, plnSellText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currencies);
        Intent intent= getIntent();

        usdBuyText= findViewById(R.id.usd_buy);
        usdSellText= findViewById(R.id.usd_sell);
        String usdBuy = intent.getStringExtra("USD_buy");
        String usdSell = intent.getStringExtra("USD_sell");
        usdBuyText.setText(usdBuy);
        usdSellText.setText(usdSell);

        eurBuyText= findViewById(R.id.eur_buy);
        eurSellText= findViewById(R.id.eur_sell);
        String eurBuy = intent.getStringExtra("EUR_buy");
        String eurSell = intent.getStringExtra("EUR_sell");
        eurBuyText.setText(eurBuy);
        eurSellText.setText(eurSell);

        gbpBuyText= findViewById(R.id.gbp_buy);
        gbpSellText= findViewById(R.id.gbp_sell);
        String gbpBuy = intent.getStringExtra("GBP_buy");
        String gbpSell = intent.getStringExtra("GBP_sell");
        gbpBuyText.setText(gbpBuy);
        gbpSellText.setText(gbpSell);

        plnBuyText= findViewById(R.id.pln_buy);
        plnSellText= findViewById(R.id.pln_sell);
        String plnBuy = intent.getStringExtra("PLN_buy");
        String plnSell = intent.getStringExtra("PLN_sell");
        plnBuyText.setText(plnBuy);
        plnSellText.setText(plnSell);
    }
}
