package com.example.sloneczna.model;

import android.widget.ImageView;

public class sklep {
    private String nazwa;
    //private ImageView zdjecie;
    private String imgurl;

    public sklep() {

    }
    public sklep(String zd, String nazwa) {
        this.nazwa = nazwa;
        this.imgurl = zd;
    }


    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


}
