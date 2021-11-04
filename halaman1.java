package com.example.utslabmpr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class halaman1 extends AppCompatActivity {


    public Button tombol, tombol1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);

        tombol = (Button) findViewById(R.id.kepersegi);
        tombol1 = (Button) findViewById(R.id.kepersegi_p);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(halaman1.this,halaman2.class);
                startActivity(intent);
            }
        });

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(halaman1.this,halaman3.class);
                startActivity(intent);
            }
        });
    }
}