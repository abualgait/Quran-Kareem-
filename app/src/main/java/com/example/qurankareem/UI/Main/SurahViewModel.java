package com.example.qurankareem.UI.Main;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.qurankareem.Network.Client;
import com.example.qurankareem.POJO.Quran;
import com.example.qurankareem.POJO.Surah;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SurahViewModel extends ViewModel {


    MutableLiveData<List<Surah>> surahMutableLiveData = new MutableLiveData<>();


    public void getSurah(){
        Client.getInstance().getSurah().enqueue(new Callback<Quran>() {
            @Override
            public void onResponse(Call<Quran> call, Response<Quran> response) {
                Surah surah = (Surah) response.body().getData();

                surahMutableLiveData.setValue((List<Surah>) surah);
                Log.v("Response !!!!!!", "BODY"+ response.body());

                Log.v("Response !!!!!!", "BODY"+ response.body().getData().get(0).getName());
               // Surah surah = response.body().getData().get(0);
               // Log.v("Response !!!!!!", "Name "+surah.getName());

            }

            @Override
            public void onFailure(Call<Quran> call, Throwable t) {

            }
        });
    }
}
