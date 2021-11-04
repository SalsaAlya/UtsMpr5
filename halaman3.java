package com.example.utslabmpr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class halaman3 extends AppCompatActivity {


    EditText inputSisi;
    Button tombolhitungp;
    TextView tampilHasilp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);
    }


    inputSisi=(EditText) findViewById(R.id.inputSisi);
    tombolhitungp=(Button) findViewById(R.id.tombolhitungp);
    tampilHasilp=(TextView) findViewById(R.id.tampilhasilp);

       tombolhitungp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            hitungLuasP();
        }
    });

}


    public void hitungLuasP(){
        try{
            Double sisi=Double.parseDouble(inputSisi.getText().toString());
            Double luas=sisi*4;
            tampilHasilp.setText(luas.toString());
        }
        catch(NumberFormatException e){
            tampilHasilp.setText("Masukkan angka");
        }
    }

}