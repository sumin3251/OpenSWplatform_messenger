package co.tinode.tindroid;
import android.app.Activity;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Toast;

import com.squareup.seismic.ShakeDetector;

public class MessageShakeDetection extends Activity implements  ShakeDetector.Listener {
    private int shakeTimes = 0;
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.fragment_messages);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ShakeDetector sd = new ShakeDetector(this);
        sd.start(sensorManager);
    }

    public void hearShake() {
        while(shakeTimes < 3) {
            shakeTimes++;
        }

        Toast.makeText(this, "흔들림이 3번 감지되었습니다.", Toast.LENGTH_SHORT).show();


    }
}

