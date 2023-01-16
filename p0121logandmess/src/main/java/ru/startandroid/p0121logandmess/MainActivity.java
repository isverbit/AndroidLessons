package ru.startandroid.p0121logandmess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Find views");
        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);
    }

    public void onClickOk(View v) {
        Log.d(TAG, "onClickOk running");
        tvOut.setText(R.string.strOk);
        Toast.makeText(this, "Pressed OK button", Toast.LENGTH_LONG).show();
    }

    public void onClickCancel(View v) {
        Log.w(TAG, "onClickCancel running");
        tvOut.setText(R.string.strCancel);
        Toast.makeText(this, "Pressed Cancel button", Toast.LENGTH_SHORT).show();
    }
}