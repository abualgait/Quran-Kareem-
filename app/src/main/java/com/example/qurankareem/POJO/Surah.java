package com.example.qurankareem.POJO;

import android.graphics.drawable.Drawable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Surah {

    @SerializedName("number")
    @Expose
    private Integer number;


    @SerializedName("name")
    @Expose
    private String name;


    @SerializedName("englishName")
    @Expose
    private String englishName;


    @SerializedName("englishNameTranslation")
    @Expose
    private String englishNameTranslation;

    @SerializedName("numberOfAyahs")
    @Expose
    private Integer numberOfAyahs;


    @SerializedName("revelationType")
    @Expose
    private String revelationType;

    public Surah(Integer number, String name, String englishName, String englishNameTranslation, Integer numberOfAyahs, String revelationType) {
        this.number = number;
        this.name = name;
        this.englishName = englishName;
        this.englishNameTranslation = englishNameTranslation;
        this.numberOfAyahs = numberOfAyahs;
        this.revelationType = revelationType;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishNameTranslation() {
        return englishNameTranslation;
    }

    public void setEnglishNameTranslation(String englishNameTranslation) {
        this.englishNameTranslation = englishNameTranslation;
    }

    public Integer getNumberOfAyahs() {
        return numberOfAyahs;
    }

    public void setNumberOfAyahs(Integer numberOfAyahs) {
        this.numberOfAyahs = numberOfAyahs;
    }

    public String getRevelationType() {
        return revelationType;
    }

    public void setRevelationType(String revelationType) {
        this.revelationType = revelationType;
    }
}
