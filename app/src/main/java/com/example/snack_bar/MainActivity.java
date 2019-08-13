package com.example.snack_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar .make(findViewById(R.id.btn),"Thong bao",1000)
                .setActionTextColor(Color.RED).setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        
                    }
                }).show();
            }
        });


    }
}
