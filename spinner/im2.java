package com.example.e2spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;//code of code-dil
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class im2 extends AppCompatActivity {
    private Button back;
    private ImageView Image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im2);
        back=findViewById(R.id.back);
        Image=findViewById(R.id.imageView2);
        info=findViewById(R.id.textView2);

        Image.setImageResource(R.drawable.unit02);
        info.setText("THIS IS 02");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(im2.this,MainActivity.class);
                startActivity(intent);//code of code-dil
            }
        });
    }
}