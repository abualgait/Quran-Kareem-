package com.example.qurankareem.UI.Main;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qurankareem.POJO.Quran;
import com.example.qurankareem.POJO.Surah;
import com.example.qurankareem.R;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class SurahAdapter extends RecyclerView.Adapter<SurahAdapter.SurahViewHolder> {
    private ArrayList<Surah> surahList = new ArrayList<>() ;

    @NonNull
    @Override
    public SurahViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new SurahViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.surah_item ,parent ,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SurahViewHolder holder, int position) {

        holder.surahArabicName.setText(surahList.get(position).getName());
        holder.surahEnglishcName.setText(surahList.get(position).getEnglishName());
        holder.surahtype.setImageDrawable(Drawable.createFromPath(surahList.get(position).getRevelationType()));





    }

    @Override
    public int getItemCount() {
        return surahList.size();
    }



    public class SurahViewHolder extends RecyclerView.ViewHolder {
        TextView surahArabicName ;
        TextView surahEnglishcName ;
        ImageView  surahtype ;

        public SurahViewHolder(@NonNull View itemView) {
            super(itemView);
            surahArabicName = itemView.findViewById(R.id.surahArabicName);
            surahEnglishcName = itemView.findViewById(R.id.surahEnglishName);
            surahtype = itemView.findViewById(R.id.surahType);

        }
    }
}
