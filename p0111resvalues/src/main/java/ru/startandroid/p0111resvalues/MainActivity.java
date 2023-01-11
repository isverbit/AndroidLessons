package ru.startandroid.p0111resvalues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvBottom;
    Button btnBottom;
    LinearLayout llBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBottom = findViewById(R.id.tvBottom);
        btnBottom = findViewById(R.id.btnBottom);
        llBottom = findViewById(R.id.llBottom);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        tvBottom.setText(R.string.tvBottomText);
        btnBottom.setText(R.string.btnBottomText);
    }
}