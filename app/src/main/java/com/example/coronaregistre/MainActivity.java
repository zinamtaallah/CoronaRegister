package com.example.coronaregistre;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    public ImageView play;
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View changelang = findViewById(R.id.changeMylang);
        changelang.setOnClickListener(v -> showChangelanguedialog());


        this.play = (ImageView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), protection.class);
                startActivity(otherActivity);

                finish();
            }
        });


    }


    private void showChangelanguedialog() {
    }


}