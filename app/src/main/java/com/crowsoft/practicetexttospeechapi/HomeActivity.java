package com.crowsoft.practicetexttospeechapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void btnTextToSpeechOnClick(View v){
        Intent textToSpeechIntent = new Intent(getApplicationContext(), TextToSpeechActivity.class);
        startActivity(textToSpeechIntent);
    }

    public void btnSpeechToTextOnClick(View v){
        Intent speechToTextIntent = new Intent(getApplicationContext(), SpeechToTextActivity.class);
        startActivity(speechToTextIntent);
    }
}
