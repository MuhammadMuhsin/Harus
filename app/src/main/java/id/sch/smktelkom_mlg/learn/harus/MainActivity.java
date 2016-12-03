package id.sch.smktelkom_mlg.learn.harus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private void aduh() {
        Intent intent = new Intent(MainActivity.this, Hewan.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.ibhewan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aduh();
            }
        });

    }


}
