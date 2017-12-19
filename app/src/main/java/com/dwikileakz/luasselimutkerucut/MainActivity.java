package com.dwikileakz.luasselimutkerucut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input_jari, input_pelukis;
    TextView hasil;
    Button hitung;

    int phi = 22/7;
    double jari;
    double pelukis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_jari = (EditText)findViewById(R.id.input_jari);
        input_pelukis = (EditText)findViewById(R.id.input_pelukis);
        hasil= (TextView)findViewById(R.id.hasil);
        hitung = (Button)findViewById(R.id.hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volume();
            }
        });
    }

    public void volume() {
        if (input_jari.getText().toString().isEmpty())
        {
            Toast.makeText(this, "TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
        }
        if(input_pelukis.getText().toString().isEmpty())
        {
            Toast.makeText(this, "TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
        }
        try
        {
            jari = Double.parseDouble(input_jari.getText().toString());
        }catch (Exception e){}
        try
        {
            pelukis = Double.parseDouble(input_pelukis.getText().toString());
        }catch (Exception e){}

        double result = phi*pelukis*jari;
        hasil.setText(" Luas Selimut Kerucut = "+String.valueOf(result));

    }
}
