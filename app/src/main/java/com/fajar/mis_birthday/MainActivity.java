package com.fajar.mis_birthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tes = (Button) findViewById(R.id.jangan);
        tes.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent newIntent = new Intent(view.getContext(), Ucapan.class);
                startActivity(newIntent);
                finish(); //difinish, biar ga makan memori? biar ga numpuk activity?
            }
        });
    }

}
