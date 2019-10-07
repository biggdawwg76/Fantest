package com.example.android.fantest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String string1 = ("MFFL, Msvs Fan For Life ");
    String string2 = (" Mark Cuban ");


    public void submitAnswer(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.MVP:
                if (checked) ;
                    //MVP is correct
                else
                    // MVP is incorrect
                    break;
            case R.id.dpoy:
                if (checked) ;
                    // Not  Defensive player of the year Incorrect
                else
                    // answer is correct
                    break;
            case R.id.Scoring:
                if (checked) ;
                    // Never an NBA SCoring chanmpion MVP is incorrect
                else
                    //  Checks in incorredt
                    break;
            case R.id.Finals:
                if (checked) ;
                    // was in NBA finals MVP is correct
                else
                    // unchecked for Finals MVP is incorrect
                    break;
            case R.id.teammate:
                if (checked) ;
                    //Was NBA teammate of the year is correct
                else
                    // not checked is incorrect
                    break;
        }

       /**
         * Displays the given score for Team B.
         */
        public void questionOne (String 'string1'){
            TextView scoreView = findViewById(R.id.questionOne);
            scoreView.setText(String.valueOf(string1));
        }

        public void QuestionTwo (String 'string2'){
            TextView scoreView = findViewById(R.id.questionTwo);
            scoreView.setText(String.valueOf(string2));
        }

    }
}