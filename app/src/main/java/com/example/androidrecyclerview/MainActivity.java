package com.example.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.androidrecyclerview.apabter.CurrencyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView currencyRecyclerView;
int kuw = R.drawable.kuwait;
int usa = R.drawable.usa;
int euro = R.drawable.euro;
  ArrayList<Currency> currencyList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       addCurrencies();

        // setting our recycleView
        currencyRecyclerView =findViewById(R.id.currencyRecyclerView);

        currencyRecyclerView = findViewById(R.id.currencyRecyclerView);
        currencyRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        CurrencyAdapter adapter = new CurrencyAdapter(currencyList);
        currencyRecyclerView.setAdapter(adapter);

        RecyclerView.ItemDecoration div = new DividerItemDecoration(this, LinearLayoutManager.VERTICAL);
        currencyRecyclerView.addItemDecoration(div);
    }
    private void addCurrencies(){

        currencyList.add(new Currency("Kuw","KWD",0.9,kuw));
        currencyList.add(new Currency("USA","$",0.9,usa));
        currencyList.add(new Currency("Kuw","Є",0.9,euro));
        ;

    }

}