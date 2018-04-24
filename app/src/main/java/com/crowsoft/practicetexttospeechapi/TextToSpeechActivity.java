package com.crowsoft.practicetexttospeechapi;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class TextToSpeechActivity extends AppCompatActivity {

    private TextToSpeech textToSpeechObj;
    private EditText eTxtTextToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);

        eTxtTextToSpeech = (EditText) findViewById(R.id.eTxtTextToSpeech);

        textToSpeechObj = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                textToSpeechObj.setLanguage(Locale.ENGLISH);
            }
        }, null);
    }

    public void btnSpeakClicked(View view){
        String textToSpeech = eTxtTextToSpeech.getText().toString();
        textToSpeechObj.speak(textToSpeech, TextToSpeech.QUEUE_FLUSH, null);
    }
}
