package com.example.ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv1;

    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =findViewById(R.id.button);
        iv1 =(ImageView) findViewById(R.id.iv);
    }

    public void clicking(View view) {
        int x=(int)(101*Math.random())%3+1;
        btn.setText(" Click for image number:"+x);
        if (x==1){
            iv1.setImageResource(R.drawable.one);
        }
        if (x==2){
            iv1.setImageResource(R.drawable.two);
        }
        if (x==3){
            iv1.setImageResource(R.drawable.three);
        }

    }
}