package com.example.eforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Categories extends AppCompatActivity {
    private Button od,lev,gp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        od = (Button)findViewById(R.id.button7);
        od .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOd();
            }



        });
        lev = (Button)findViewById(R.id.button10);
        lev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openleave();
            }
        });
        gp = (Button)findViewById(R.id.button11);
        gp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengp();
            }
        });
    }

    private void opengp() {
        Intent intent = new Intent(this,gp.class);
        startActivity(intent);

    }

    private void openleave() {
        Intent intent = new Intent(this,leave.class);
        startActivity(intent);
    }

    private void openOd() {
        Intent intent = new Intent(this,od.class);
        startActivity(intent);
    }
}