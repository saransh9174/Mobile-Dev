package com.example.e2spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;//code of code-dil
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);
        image=findViewById(R.id.image);

        String [] p1={
                "SELECT",
                "IMAGE1",
                "IMAGE2",
        };

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,p1);
        spinner.setAdapter(adapter);//code of code-dil

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        image.setImageResource(android.R.color.transparent);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.unit01);
                        Intent image1_intent =new Intent(MainActivity.this,im1.class);
                        startActivity(image1_intent);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.unit02);
                        Intent image2_intent= new Intent(MainActivity.this,im2.class);
                        startActivity(image2_intent);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}