package ti_141fr.lazarencomihai.anew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void OnButtonClick(View v){
        if(v.getId()==R.id.btn3){
            Intent i = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(i);
        }
    }
}
