package com.muravey;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamA = 0;
    int teamB = 0;

    public void setTeamA1(View viw){
        teamA = teamA + 1;
        score_board_a_current(teamA);
    }

    public void setTeamA2(View viw){
        teamA = teamA + 2;
        score_board_a_current(teamA);
    }


    public void setTeamA3(View viw){
        teamA = teamA + 3;
        score_board_a_current(teamA);
    }

    public void setTeamB1(View viw){
        teamB = teamB + 1;
        score_board_b_current(teamB);
    }

    public void setTeamB2(View viw){
        teamB = teamB + 2;
        score_board_b_current(teamB);
    }

    public void setTeamB3(View viw){
        teamB = teamB + 3;
        score_board_b_current(teamB);
    }


    @SuppressLint("SetTextI18n")
    public void score_board_a_current(int number){
       textView1.findViewById(R.id.score_board_a);
       textView1.setText(" " + number);
    }

    @SuppressLint("SetTextI18n")
    public void score_board_b_current(int number){
        textView2.findViewById(R.id.score_board_b);
        textView2.setText(" " + number);
    }
}