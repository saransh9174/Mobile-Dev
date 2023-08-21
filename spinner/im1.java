package com.example.e2spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class im1 extends AppCompatActivity {
    private Button back;//code of code-dil
    private ImageView Image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im1);
        back=findViewById(R.id.back);
        Image=findViewById(R.id.imageView1);
        info=findViewById(R.id.textView1);

        Image.setImageResource(R.drawable.unit01);
        info.setText("THIS IS 01");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(im1.this,MainActivity.class);
                startActivity(intent);//code of code-dil
            }
        });
    }
}