package com.sewsewyou.ssy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CameraModeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_mode);


        Button btn_selfie = (Button)findViewById(R.id.btn_selfie);
        Button btn_snapshot = (Button)findViewById(R.id.btn_snapshot);

        btn_selfie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CameraModeActivity.this, FrontViewActivity.class);
                startActivity(intent);
            }
        });

        btn_snapshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CameraModeActivity.this, FrontViewActivity.class);
                startActivity(intent);
            }
        });

    }
}
