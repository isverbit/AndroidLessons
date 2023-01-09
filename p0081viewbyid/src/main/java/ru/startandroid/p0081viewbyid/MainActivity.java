package ru.startandroid.p0081viewbyid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = findViewById(R.id.myText);
        myTextView.setText(R.string.newText);

        Button myBtn = findViewById(R.id.myBtn);
        myBtn.setText(R.string.myButton);
        myBtn.setEnabled(false);

        CheckBox myChb = findViewById(R.id.checkBox);
        myChb.setChecked(true);
    }
}