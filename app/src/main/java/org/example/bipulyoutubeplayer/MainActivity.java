package org.example.bipulyoutubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSingle = findViewById(R.id.btnPlaySingle);
        Button btnStandalone = findViewById(R.id.btnStandAlone);

        btnSingle.setOnClickListener(this);
        btnStandalone.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        if(view.getId() == R.id.btnPlaySingle){
            intent = new Intent(MainActivity.this, YoutubeActivity.class);
        }
        else if(view.getId() == R.id.btnStandAlone){
            intent = new Intent(MainActivity.this, Standalone.class);
        }

        if(intent != null){
            startActivity(intent);
        }
    }
}
