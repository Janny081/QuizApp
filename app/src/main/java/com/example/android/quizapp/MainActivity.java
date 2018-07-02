package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submit_quiz(View view) {
        RadioButton losang = (RadioButton) findViewById(R.id.los_ang);
        boolean Losang = losang.isChecked();

        RadioButton Africa = (RadioButton) findViewById(R.id.africa);
        boolean Afri_ca = Africa.isChecked();

        CheckBox beggersBan = (CheckBox) findViewById(R.id.beggers_ban);
        boolean Beggers_Ban = beggersBan.isChecked();
        CheckBox Bridges = (CheckBox) findViewById(R.id.bridges);
        boolean brid_ges = Bridges.isChecked();

        RadioButton Horses = (RadioButton) findViewById(R.id.horses);
        boolean Hors_es = Horses.isChecked();

        EditText sumanswer = (EditText) findViewById(R.id.sum_answer);
        String Sum_Answer = sumanswer.getText().toString();
        int editans = Integer.parseInt(Sum_Answer);


        int total = calculatePoint(Losang, Afri_ca, Beggers_Ban, brid_ges, Hors_es, editans);
        String DisplayScore = displayScore(total);
        Toast.makeText(this, DisplayScore, Toast.LENGTH_LONG).show();

    }


    private int calculatePoint(boolean addlosang, boolean addafrica, boolean addbeggers, boolean addbridges, boolean addhorses,
                               int addsumanswer) {
        int points = 0;
        {
            if (addlosang)
                points = points + 5;
        }
        if (addafrica) {
            points += 5;
        }
        if (addbeggers) {
            points += 5;
        }
        if (addbridges) {
            points += 5;

        }
        if (addhorses) {
            points += 5;
        }
        if (addsumanswer == 52) {
            points += 5;
        }

        return points;
    }

    private String displayScore(int score) {
        String display = "Your Quiz Score is " + score;
        return display;
    }


}
