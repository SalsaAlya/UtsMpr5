package com.example.utslabmpr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class halaman2 extends AppCompatActivity {

    EditText inputpanjang,inputlebar;
    Button tombolhitungpp;
    TextView tampilhasilpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
    }

    inputpanjang=(EditText) findViewById(R.id.inputPanjang);
    inputlebar=(EditText) findViewById(R.id.inputLebar);
    tombolhitungpp=(Button) findViewById(R.id.tombolhitungpp);
    tampilhasilpp=(TextView) findViewById(R.id.tampilhasilpp);

       tombolhitungpp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            hitungLuasPP();
        }
    });

}


    public void hitungLuasPP(){
        try{
            Double panjang=Double.parseDouble(inputPanjang.getText().toString());
            Double lebar=Double.parseDouble(inputLebar.getText().toString());
            Double luas=panjang*lebar;
            tampilHasilpp.setText(luas.toString());
        }
        catch(NumberFormatException e){
            tampilHasilpp.setText("Masukkan angka");
        }
    }
}