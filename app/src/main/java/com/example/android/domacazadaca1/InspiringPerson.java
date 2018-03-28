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
                     private int dayBirth;
                     private int monthBirth;
                     private int yearBirth;
                     private int dayDeath;
                     private int monthDeath;
                     private int yearDeath;
                     private String bio;
                     private String quote;

    public InspiringPerson(String name, int dayBirth, int monthBirth, int yearBirth, int dayDeath, int monthDeath, int yearDeath) {
        this.name = name;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.dayDeath = dayDeath;
        this.monthDeath = monthDeath;
        this.yearDeath = yearDeath;
        this.createLifeTime();
    }

   private void createLifeTime()
    {
        if(this.dayBirth > 0 && this.monthBirth > 0 && this.yearBirth > 0 && this.dayDeath >0 && this.monthDeath > 0 && this.yearDeath >0)
        {
            this.lifeTime=String.valueOf(this.dayBirth)+"."+String.valueOf(this.monthBirth)+"."+String.valueOf(this.yearBirth)+"-"+String.valueOf(this.dayDeath)+"."+String.valueOf(this.monthDeath)+"."+String.valueOf(this.yearDeath);

        }
        else if  (this.dayDeath ==0 && this.monthDeath==0 && this.yearDeath ==0)
        {

           this.lifeTime=String.valueOf(this.dayBirth)+"."+String.valueOf(this.monthBirth)+"."+String.valueOf(this.yearBirth)+"-...";
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
