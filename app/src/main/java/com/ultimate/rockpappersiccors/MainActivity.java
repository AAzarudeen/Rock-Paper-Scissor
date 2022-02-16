package com.ultimate.rockpappersiccors;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView rock,paper,scissors;
    TextView computer;
    TextView human;
    TextView beast;
    Random ran;
    int position,computerScore,humanScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rock = findViewById(R.id.rock) ;
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scissors);
        beast = findViewById(R.id.beast);
        computer = findViewById(R.id.computerScore);
        human = findViewById(R.id.humanScore);
        ran = new Random();
        position = ran.nextInt(3);
        rock.setOnClickListener(v -> rockClick());
        paper.setOnClickListener(v -> paperClick());
        scissors.setOnClickListener(v -> scissorClick());
    }
    public void rockClick(){
        position = ran.nextInt(3);
        if (position == 0){
            beast.setText("TIE\nCOMPUTER : ROCK");
        }
        else if (position == 1){
            beast.setText("COMPUTER WON\n COMPUTER : PAPER");
            computer.setText(String.valueOf(++computerScore));
        }
        else {
            beast.setText("YOU WON\n COMPUTER : SCISSORS");
            human.setText(String.valueOf(++humanScore));
        }
    }
    public void paperClick(){
        position = ran.nextInt(3);
        if (position == 0){
            beast.setText("YOU WON\n COMPUTER : ROCK");
            human.setText(String.valueOf(++humanScore));
        }
        else if (position == 1){
            beast.setText("TIE\nCOMPUTER : PAPER");
        }
        else {
            beast.setText("COMPUTER WON\n COMPUTER : SCISSORS");
            computer.setText(String.valueOf(++computerScore));
        }
    }
    public void scissorClick(){
        position = ran.nextInt(3);
        if (position == 0){
            beast.setText("COMPUTER WON\n COMPUTER : ROCK");
            computer.setText(String.valueOf(++computerScore));
        }
        else if (position == 1){
            beast.setText("YOU WON\n COMPUTER : PAPER");
            human.setText(String.valueOf(++humanScore));
        }
        else {
            beast.setText("TIE\nCOMPUTER : SCISSOR");
        }
    }
}