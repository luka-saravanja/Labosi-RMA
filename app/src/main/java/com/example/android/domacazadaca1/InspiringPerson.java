package com.example.android.domacazadaca1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Luka on 22.3.2018..
 */

public class InspiringPerson {
                     private String name;
                     private String lifeTime;
                      private String dateBirth  ;
                     private String dateDeath;
                     private String bio;
                     private String quote;

    public InspiringPerson(String name, String dateBirth, String dateDeath) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.dateDeath = dateDeath;
        this.createLifeTime();
    }

    private void createLifeTime()
    {
        if(dateDeath.equals("0"))
        {
            this.lifeTime=this.dateBirth+"-...";
        }
        else
        {
            this.lifeTime=dateBirth+"-"+dateDeath;
        }
    }



    public String getName() {
        return name;
    }

    public String getLifeTime() { return lifeTime; }

    public String getQuote() { return quote; }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
