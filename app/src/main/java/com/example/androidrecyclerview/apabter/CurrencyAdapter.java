package com.example.androidrecyclerview.apabter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidrecyclerview.Currency;
import com.example.androidrecyclerview.R;

import java.util.ArrayList;

public class CurrencyAdapter extends RecyclerView.Adapter <CurrencyAdapter.ViewHolder>{
   private ArrayList<Currency> currenciesList;


    public CurrencyAdapter(ArrayList<Currency> currenciesList){
        this.currenciesList=currenciesList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameTextView, exchangeTextView,codeTextView;
        ImageView countryImageView;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            nameTextView = itemView.findViewById(R.id.currencyName);
            exchangeTextView = itemView.findViewById(R.id.exchangeRate);
            codeTextView = itemView.findViewById(R.id.currencyCode);
            countryImageView = itemView.findViewById(R.id.countryImageView);


        }



    }

    @NonNull
    @Override
    public CurrencyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.currency_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyAdapter.ViewHolder holder, int position) {
       String accountName = currenciesList.get(position).getCurrencyName();
        holder.nameTextView.setText(accountName);
        Currency currency = currenciesList.get(position);
        String currencyName = currency.getCurrencyName();
        String currencyCode = currency.getCurrencyCode();
        double currencyRate = currency.getExchangeRate();
        int countryImageView = currency.getCountryFlag();

        holder.nameTextView.setText(currencyName);
        holder.exchangeTextView.setText(String.valueOf(currencyRate));
        holder.codeTextView.setText(currencyCode);
        holder.countryImageView.setImageResource(currency.getCountryFlag());


    }
    @Override
    public int getItemCount() {


        return currenciesList.size();
    }



}
