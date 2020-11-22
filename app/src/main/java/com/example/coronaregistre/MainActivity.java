package com.example.coronaregistre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    


    private void setSupportActionBar(Toolbar toolbar) {
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu , menu);
        return true;
    }

}