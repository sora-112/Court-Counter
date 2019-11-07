package com.example.android.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointerA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);

    }

    public void twoPointerA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);

    }

    public void freeThrowA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointerB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);

    }

    public void twoPointerB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

    }

    public void freeThrowB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);

    }

    public void resetBoth(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}