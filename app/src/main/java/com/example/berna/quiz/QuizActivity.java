package com.example.berna.quiz;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuizActivity extends AppCompatActivity {

    public static final String GAME_PREFERENCES = "GamePrefs";
    public SharedPreferences settings = getSharedPreferences(GAME_PREFERENCES,MODE_PRIVATE);
    SharedPreferences.Editor prefEditor = settings.edit();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }
}
