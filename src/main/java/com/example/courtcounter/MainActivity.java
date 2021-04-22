package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score,score1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void threeScore(View view){
        score+=3;
        displayForTeamA(score);

    }
    public void twoScore(View view){
        score += 2;
        displayForTeamA(score);

    }
    public void freeScore(View view){
        score+=1;
        displayForTeamA(score);

    }
    public void threeScore1(View view){
        score1+=3;
        displayForTeamB(score1);
    }
    public void twoScore1(View view){
        score1 += 2;
        displayForTeamB(score1);
    }
    public void freeScore1(View view){
        score1+=1;
        displayForTeamB(score1);
    }
    public void reset(View view)
    {
        score1=0;
        score=0;
        displayForTeamB(score1);
        displayForTeamA(score);
    }
    private void displayForTeamA(int score)
    {
        TextView team_A=(TextView) findViewById(R.id.teamA_score);
        team_A.setText(String.valueOf(score));
    }
    private void displayForTeamB(int score1)
    {
        TextView team_B=(TextView) findViewById(R.id.teamB_score);
        team_B.setText(String.valueOf(score1));
    }
}