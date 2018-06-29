package com.geekbrains.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class WeatherForTheCity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_layout);
        if (getIntent().getExtras() != null) {
            String text = getIntent().getExtras().getString("city");
            TextView textView = findViewById(R.id.tv);
            textView.setText(text);
            View view = findViewById(R.id.rl);
            view.setBackground(getDrawable(R.drawable.msk));

        }
    }
}
