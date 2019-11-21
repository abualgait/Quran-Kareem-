package com.example.qurankareem.Network;

import com.example.qurankareem.POJO.Quran;
import com.example.qurankareem.POJO.Surah;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuranInterface {

    @GET("surah")
    Call<Quran> getSurah();



    //http://api.alquran.cloud/v1/quran/en.asad
}
