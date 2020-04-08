package com.ramaria.androidexampleprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    protected ProgressBar progressBarHorizontal;
    protected ProgressBar progressBarCircular;
    protected int progresso = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
    progressBarCircular = findViewById(R.id.progressBarCircular);

    progressBarCircular.setVisibility(View.GONE);

    }
    public void carregarProgressBar(View view){

        this.progresso = this.progresso+1;
        progressBarHorizontal.setProgress(this.progresso);

        progressBarCircular.setVisibility(View.VISIBLE);

        if(this.progresso == 10){
            progressBarCircular.setVisibility(View.GONE);
        }

    }

}
