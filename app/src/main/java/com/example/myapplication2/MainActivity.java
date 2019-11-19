package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button mbttextview;
    private Button mbtbutton;
    private Button mbtedittext;//alt+enter快捷键引入import包
    private ImageView imageView;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.startwords);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,mapactivity.class);
                startActivity(intent);
            }
        });






    }


}
