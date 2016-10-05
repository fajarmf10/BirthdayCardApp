package com.fajar.mis_birthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by heimdall on 10/5/16.
 *
 * Tetot!
 */

public class Ucapan extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ucapan);
    }

    public void onBackPressed(){
        /*
        * Done nih, ngga tau, mungkin ada implementasi yang lebih cakep dari ini?
        */
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
        finish();

    }
}