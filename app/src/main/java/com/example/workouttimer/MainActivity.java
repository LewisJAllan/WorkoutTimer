package com.example.workouttimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtTimer;
    private EditText edtNumOfRounds, edtRestFrequency, edtRestTime, edtLengthOfRound;
    private ImageButton btnPlay, btnPause, btnStop;
    private Button btnStart;
    private int totalRounds, restEvery;
    private long roundTime, restTime;
    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTimer = (TextView) findViewById(R.id.txtTimer);
        edtLengthOfRound = (EditText) findViewById(R.id.edtLengthOfRound);
        edtNumOfRounds = (EditText) findViewById(R.id.edtNumOfRounds);
        edtRestFrequency = (EditText) findViewById(R.id.edtRestFrequency);
        edtRestTime = (EditText) findViewById(R.id.edtRestTime);
        btnPause = (ImageButton) findViewById(R.id.btnPause);
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);
        btnStop = (ImageButton) findViewById(R.id.btnStop);
        btnStart = (Button) findViewById(R.id.btnStart);
    }

    public void startTimer(View v) {
        totalRounds = Integer.parseInt(edtNumOfRounds.getText().toString());
        restEvery = Integer.parseInt(edtRestFrequency.getText().toString());
        roundTime = Long.parseLong(edtLengthOfRound.getText().toString()) * 60000;
    }
}
