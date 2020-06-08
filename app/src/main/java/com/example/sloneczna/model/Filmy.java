package com.example.sloneczna.model;

import android.widget.Button;
import android.widget.ListView;

public  class Filmy {
    private String zdj;
    private String Filmy;
    private String b1;
    private String b2;
    private String b3;
    private String b4;
    private String b5;
    private String b6;


    public Filmy(String zdj, String filmy, String b1, String b2, String b3, String b4, String b5, String b6) {
        this.zdj = zdj;
        Filmy = filmy;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b5 = b5;
        this.b6 = b6;
    }

    public String getZdj() {
        return zdj;
    }

    public void setZdj(String zdj) {
        this.zdj = zdj;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getB4() {
        return b4;
    }

    public void setB4(String b4) {
        this.b4 = b4;
    }

    public String getFilmy() {
        return Filmy;
    }

    public void setFilmy(String filmy) {
        Filmy = filmy;
    }

    public String getB5() {
        return b5;
    }

    public void setB5(String b5) {
        this.b5 = b5;
    }

    public String getB6() {
        return b6;
    }

    public void setB6(String b6) {
        this.b6 = b6;
    }
}
