package com.example.admin.hangman;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton b1 = (ImageButton) findViewById(R.id.imageButton2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void start1player(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        this.startActivity(intent);
    }

    public void startHowToPlay(View view){
        Intent intent = new Intent(this, Main3Activity.class);
        this.startActivity(intent);
    }

    public static void changeLocale(Resources res, String locale){
        Configuration config;
        config = new Configuration(res.getConfiguration());

        switch(locale){
            case "en":
                config.locale = Locale.ENGLISH;
                break;
            case "no":
                config.locale = new Locale("no");
                break;
            default:
                config.locale = Locale.ENGLISH;
        }

        res.updateConfiguration(config, res.getDisplayMetrics());
    }
}
