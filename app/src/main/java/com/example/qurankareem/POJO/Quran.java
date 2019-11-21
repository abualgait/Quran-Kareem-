package com.example.qurankareem.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Quran {


    @SerializedName("code")
    @Expose
    private Integer code;



    @SerializedName("status")
    @Expose
    private String status;



    @SerializedName("data")
    @Expose
    private List< Surah > data ;

    public Quran(Integer code, String status, List<Surah> data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Surah> getData() {
        return data;
    }

    public void setData(List<Surah> data) {
        this.data = data;
    }
}
