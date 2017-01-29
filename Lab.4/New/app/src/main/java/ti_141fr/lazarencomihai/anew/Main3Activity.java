package ti_141fr.lazarencomihai.anew;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Main3Activity extends AppCompatActivity {
    public Button buton;
    public Chronometer cronometru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        buton=(Button)findViewById(R.id.button2);
        cronometru=(Chronometer)findViewById(R.id.chronometer3);
    }

    public void startTime(View view){
cronometru.setBase(SystemClock.elapsedRealtime());
        cronometru.start();
        return;
    }
}
