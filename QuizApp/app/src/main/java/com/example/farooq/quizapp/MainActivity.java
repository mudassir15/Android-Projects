package com.example.farooq.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int increment = 0;
    int decrement = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage() {
        RadioButton myRadioButton = (RadioButton) findViewById(R.id.q1);
        boolean checkQuestion1 = myRadioButton.isChecked();

        if (checkQuestion1) {
            Toast.makeText(this, "You are correct, WELL DONE!", Toast.LENGTH_SHORT).show();
            increment = increment + 1;
            return;
        } else {
            Toast.makeText(this, "You are wrong, Nice Try!", Toast.LENGTH_SHORT).show();
            decrement = decrement + 1;
        }
    }

    public void displayMessage2() {
        RadioButton myRadioButton2 = (RadioButton) findViewById(R.id.q2);
        boolean checkQuestion2 = myRadioButton2.isChecked();
        if (checkQuestion2) {
            Toast.makeText(this, "You are correct, WELL DONE!", Toast.LENGTH_SHORT).show();
            increment = increment + 1;
            return;
        } else {
            Toast.makeText(this, "You are wrong, Nice Try!", Toast.LENGTH_SHORT).show();
            decrement = decrement + 1;
        }
    }

    public void displayMessage3() {
        RadioButton myRadioButton3 = (RadioButton) findViewById(R.id.q3);
        boolean checkQuestion3 = myRadioButton3.isChecked();
        if (checkQuestion3) {
            Toast.makeText(this, "You are correct, WELL DONE!", Toast.LENGTH_SHORT).show();
            increment = increment + 1;
            return;
        } else {

            Toast.makeText(this, "You are wrong, Nice Try!", Toast.LENGTH_SHORT).show();
            decrement = decrement + 1;
        }
    }

    public void displayMessage4() {
        RadioButton myRadioButton4 = (RadioButton) findViewById(R.id.q4);
        boolean checkQuestion4 = myRadioButton4.isChecked();
        if (checkQuestion4) {
            Toast.makeText(this, "You are correct, WELL DONE!", Toast.LENGTH_SHORT).show();
            increment = increment + 1;
            return;
        } else {
            Toast.makeText(this, "You are wrong, Nice Try!", Toast.LENGTH_SHORT).show();
            decrement = decrement + 1;
        }
    }

    public void displayMessage5() {
        RadioButton myRadioButton5 = (RadioButton) findViewById(R.id.q5);
        boolean checkQuestion5 = myRadioButton5.isChecked();
        if (checkQuestion5) {
            Toast.makeText(this, "You are correct, WELL DONE!", Toast.LENGTH_SHORT).show();
            increment = increment + 1;
            return;
        } else {
            Toast.makeText(this, "You are wrong, Nice Try!", Toast.LENGTH_SHORT).show();
            decrement = decrement + 1;
        }
    }

    public void checkAnswer(View view) {
        displayMessage();

    }

    public void checkAnswer2(View view) {
        displayMessage2();
    }

    public void checkAnswer3(View view) {
        displayMessage3();
    }

    public void checkAnswer4(View view) {
        displayMessage4();
    }

    public void checkAnswer5(View view) {
        displayMessage5();
    }


    public void totalAnswerCheck(View view) {

        Toast.makeText(this, +increment + " Questions Correct and " + decrement + " Wrong", Toast.LENGTH_LONG).show();
    }
}
