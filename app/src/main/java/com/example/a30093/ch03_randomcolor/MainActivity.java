package com.example.a30093.ch03_randomcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3;
    View linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.txvR);
        tv2 = (TextView) findViewById(R.id.txvG);
        tv3 = (TextView) findViewById(R.id.txvB);
        linear = findViewById(R.id.colorBlock);
    }

    public void changeColor (View v) {
        int red, green, blue;
        Random r = new Random();

        red = r.nextInt(256);
        green = r.nextInt(256);
        blue = r.nextInt(256);

        tv1.setText("Red: " + red);
        tv2.setText("Green: " + green);
        tv3.setText("Blue: " + blue);

        tv1.setTextColor(Color.rgb(red, 0, 0));
        tv2.setTextColor(Color.rgb(0, green, 0));
        tv3.setTextColor(Color.rgb(0, 0, blue));

        linear.setBackgroundColor(Color.rgb(red, green, blue));
    }
}
