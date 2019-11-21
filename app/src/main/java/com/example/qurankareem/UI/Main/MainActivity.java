package com.example.qurankareem.UI.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.qurankareem.POJO.Quran;
import com.example.qurankareem.POJO.Surah;
import com.example.qurankareem.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    SurahViewModel surahViewModel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        surahViewModel = ViewModelProviders.of(this).get(SurahViewModel.class);
        surahViewModel.getSurah();


        RecyclerView recyclerView = findViewById(R.id.surahRecyclerView);
        final SurahAdapter surahAdapter = new SurahAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(surahAdapter);


        surahViewModel.surahMutableLiveData.observe(this, new Observer<List<Surah>>() {
            @Override
            public void onChanged(Surah surahs) {
               // surahAdapter.
            }
        });


    }
}
