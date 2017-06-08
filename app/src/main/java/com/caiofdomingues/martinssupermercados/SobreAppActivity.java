package com.caiofdomingues.martinssupermercados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SobreAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_app);

        Button btnchangelog = (Button) findViewById(R.id.btnchangelog);

        btnchangelog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(SobreAppActivity.this, ChangelogActivity.class);
                startActivity(it);
            }
        });
    }
}
