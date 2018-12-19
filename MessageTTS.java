package co.tinode.tindroid;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MessageTTS extends Activity {
    private TextToSpeech tts;
    private TextView inputtext;
    private ImageButton imgbutton;

    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.message_left_single);

        inputtext = (TextView)findViewById(R.id.messageText);
        imgbutton = (ImageButton)findViewById(R.id.speaker);

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS) {
                    tts.setLanguage(Locale.KOREAN);
                }
                else if (status == TextToSpeech.ERROR) {
                    // Toast.makeText(this,"Error occurred while initializing Text-To-Speech engine", Toast.LENGTH_LONG).show();
                }
            }
        });

        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tts.speak(inputtext.getText().toString(),TextToSpeech.QUEUE_ADD, null);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
    }

}
