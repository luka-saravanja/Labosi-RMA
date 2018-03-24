package com.example.android.domacazadaca1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final InspiringPerson person1=new InspiringPerson("Dennis Ritchie",9,9,1941,12,10,2011);
              person1.createLifeTime();
              person1.setBio("Bio je američki računalni znanstvenik poznat po svojem utjecaju na ALTRAN, B," +
                      " BCPL, C, Multics i Unix. Dobio je Turingovu nagradu 1983. i " +
                      "Nacionalnu medalju tehnologije 1998 21. travnja 1999. godine." +
                      " Ritchie je bio vođa odsjeka za istraživanje sistemske programske" +
                      " podrške tvrtke Lucent Technologies do umirovljenja 2007. godine.");
              person1.setQuote("UNIX is basically a simple operating system, but you have to be a genius to understand the simplicity");

        final InspiringPerson person2=new InspiringPerson("Linus Torvalds",28,12,1960,0,0,0);
              person2.createLifeTime();
              person2.setBio("Finski znanstvenik, kreator je Linux kernela. Iako je studirao računarstvo," +
                      " fakultet nikada nije završio Linus je, inspiriran Minix-om," +
                      " kojeg je napravio Andrew Tanenbaum, napravio operacijski sustav" +
                      " sličan Unixu, kojem je dao ime Linux. On je 1991. godine objavio prvu službenu " +
                      "verziju Linux kernela, 0.01. Danas je vrlo poznat i programira i dalje");
              person2.setQuote("Intelligence is the ability to avoid doing work, yet getting the work done");

       final InspiringPerson person3=new InspiringPerson("James Gosling",19,5,1955,0,0,0);
             person3.createLifeTime();
             person3.setBio("Kanadski računalni znanstvenik, najpoznatiji kao osnivač i voditelj Java programskog jezika. " +
                     "Izradio je originalni dizajn Java i implementirao izvorni prevodilac i virtualni stroj jezika.");
             person3.setQuote("If I were to pick a language to use today other than Java, it would be Scala");

        TextView prviName=(TextView)findViewById(R.id.textViewName);
        TextView prviBirthday=(TextView)findViewById(R.id.textViewBirthday);
        TextView prviBio=(TextView)findViewById(R.id.textViewBio);
        prviBio.setMovementMethod(new ScrollingMovementMethod());


        TextView drugiName=(TextView)findViewById(R.id.textViewName1);
        TextView drugiBirthday=(TextView)findViewById(R.id.textViewBirthday1);
        TextView drugiBio=(TextView)findViewById(R.id.textViewBio1);
        drugiBio.setMovementMethod(new ScrollingMovementMethod());

        TextView treciBio=(TextView)findViewById(R.id.textViewBio2);
        TextView treciName=(TextView)findViewById(R.id.textViewName2);
        TextView treciBirthday=(TextView)findViewById(R.id.textViewBirtdhay2);
        treciBio.setMovementMethod(new ScrollingMovementMethod());

        ImageButton prva=(ImageButton)findViewById(R.id.imageButton);
        ImageButton druga=(ImageButton)findViewById(R.id.imageButton2);
        ImageButton treca=(ImageButton)findViewById(R.id.imageButton3);

        prviBio.setText(person1.getBio());
        prviName.setText(person1.getName());
        prviBirthday.setText(person1.getLifeTime());

        drugiName.setText(person2.getName());
        drugiBirthday.setText(person2.getLifeTime());
        drugiBio.setText(person2.getBio());


        treciName.setText(person3.getName());
        treciBirthday.setText(person3.getLifeTime());
        treciBio.setText(person3.getBio());

        prva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, person1.getQuote(), Toast.LENGTH_SHORT).show();
            }
        });

        druga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, person2.getQuote(), Toast.LENGTH_SHORT).show();
            }
        });

        treca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, person3.getQuote(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
