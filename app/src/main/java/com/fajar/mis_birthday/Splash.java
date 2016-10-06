package com.fajar.mis_birthday;

/**
 * Created by heimdall on 10/4/16
 *
 * Add a simple splash screen :p
 */

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Splash extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        View haha = findViewById(R.id.splashscreen);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar2);
        progressBar.getIndeterminateDrawable().setColorFilter(Color.WHITE, android.graphics.PorterDuff.Mode.MULTIPLY);

        Snackbar snekbar = Snackbar.make(haha, "Launching the apps, please wait...", Snackbar.LENGTH_LONG);
        View viewnyasb = snekbar.getView();
        TextView viewteks = (TextView) viewnyasb.findViewById(android.support.design.R.id.snackbar_text);
        viewteks.setTextColor(Color.WHITE);
        snekbar.show();

        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
                finish();
            }
        }, secondsDelayed * 3000);
    }
}