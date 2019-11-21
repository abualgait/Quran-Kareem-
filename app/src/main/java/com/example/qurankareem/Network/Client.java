package com.example.qurankareem.Network;

import com.example.qurankareem.POJO.Quran;
import com.example.qurankareem.POJO.Surah;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
    private static final String Base_URL ="http://api.alquran.cloud/v1/";

    private QuranInterface quranInterface ;

    public static  Client instance ;

    public Client() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Base_URL).addConverterFactory(GsonConverterFactory.create())
                .build();

        quranInterface = retrofit.create(QuranInterface.class);

    }

    public static Client getInstance() {
        if (null == instance){
            instance =  new Client() ;
        }
        return instance;
    }

    public Call<Quran> getSurah(){
        return quranInterface.getSurah();

    }
}
